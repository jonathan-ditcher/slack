package com.slack;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.slack.dto.*;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.*;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jonathanditcher
 * Date: 23/03/17
 * Time: 13:36
 * To change this template use File | Settings | File Templates.
 */
public class SlackMessagingApi {

    private static final Logger logger = LoggerFactory.getLogger(SlackMessagingApi.class);
    private static final String END_POINT = "https://slack.com/api/";

    private String clientId;
    private String clientSecret;

    public SlackMessagingApi(String clientId, String clientSecret) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

    public AccessTokenResponse getAccessToken(String code, String redirect_uri) {
        logger.trace("code[{}] redirect_uri[{}]", code, redirect_uri);

        final String endpoint = "oauth.access";

        List<NameValuePair> nameValuePairs = new LinkedList<>();
        nameValuePairs.add(new BasicNameValuePair("client_id", this.clientId));
        nameValuePairs.add(new BasicNameValuePair("client_secret", this.clientSecret));
        nameValuePairs.add(new BasicNameValuePair("code", code));
        nameValuePairs.add(new BasicNameValuePair("redirect_uri", redirect_uri));

        AccessTokenResponse accessTokenResponse = this.execute(endpoint, AccessTokenResponse.class, nameValuePairs);

        return accessTokenResponse;
    }

    public PostMessageResponse sendDirectMessage(String accessToken, String channel, String text) {
        logger.trace("accessToken[{}] channel[{}] text[{}]", accessToken, channel, text);

        final String endpoint = "chat.postMessage";

        List<NameValuePair> nameValuePairs = new LinkedList<>();
        nameValuePairs.add(new BasicNameValuePair("token", accessToken));
        nameValuePairs.add(new BasicNameValuePair("channel", channel));
        nameValuePairs.add(new BasicNameValuePair("text", text));
        nameValuePairs.add(new BasicNameValuePair("as_user", "true"));

        PostMessageResponse messageResponse = this.execute(endpoint, PostMessageResponse.class, nameValuePairs);

        return messageResponse;
    }

    public ListChannelsResponse listIMChannels(String accessToken) {
        logger.trace("accessToken["+accessToken+"]");

        final String endpoint = "im.list";
        ListChannelsResponse listChannelsResponse = this.executeGet(accessToken, endpoint, ListChannelsResponse.class);

        return listChannelsResponse;
    }

    public ListUsersResponse listUsers(String accessToken) {
        logger.trace("accessToken["+accessToken+"]");

        final String endpoint = "users.list";
        ListUsersResponse listUsersResponse = this.executeGet(accessToken, endpoint, ListUsersResponse.class);

        return listUsersResponse;
    }

    private <T extends SlackResponse> T executeGet(String accessToken, String endpoint, Class<T> clazz) {
        logger.trace("accessToken["+accessToken+"]");

        T slackResponse = null;

        try (CloseableHttpClient httpClient = HttpClientBuilder.create().build()) {

            HttpGet request = new HttpGet(END_POINT + endpoint);

            URI uri = new URIBuilder(request.getURI()).
                    addParameter("token", accessToken).
                    build();
            request.setURI(uri);

            logger.trace("executing request " + request.getRequestLine());
            HttpResponse response = httpClient.execute(request);

            HttpEntity entity = response.getEntity();

            ObjectMapper objectMapper = new ObjectMapper();
            slackResponse = objectMapper.readValue(entity.getContent(), clazz);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        return slackResponse;
    }

    private <T extends SlackResponse> T execute(String endpoint, Class<T> clazz, List<NameValuePair> nameValuePairs) {
        logger.trace("endpoint[{}] clazz[{}] nameValuePairs[{}]", endpoint, clazz, nameValuePairs);

        T slackResponse = null;

        try (CloseableHttpClient httpClient = HttpClientBuilder.create().build()) {

            HttpPost httppost = new HttpPost(END_POINT + endpoint);

            httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));

            logger.trace("executing request " + httppost.getRequestLine());
            HttpResponse response = httpClient.execute(httppost);

            HttpEntity entity = response.getEntity();

            ObjectMapper objectMapper = new ObjectMapper();
            slackResponse = objectMapper.readValue(entity.getContent(), clazz);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return slackResponse;
    }

    public String getAuthorizationURI(String redirectURI) {
        final String scope = "channels:read chat:write:user chat:write:bot im:read users:read";
        return this.getAuthorizationURI(redirectURI, scope);
    }

    public String getAuthorizationURI(String redirectURI, String scope) {

        String uri = null;
        try {
            uri = "https://slack.com/oauth/authorize?client_id=" + this.clientId +
                    "&scope=" + URLEncoder.encode(scope, "UTF-8") +
                    "&redirect_uri=" + URLEncoder.encode(redirectURI, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return uri;
    }
}
