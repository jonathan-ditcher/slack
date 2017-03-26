package com.slack.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jonathanditcher
 * Date: 24/03/17
 * Time: 10:55
 * To change this template use File | Settings | File Templates.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class ListChannelsResponse extends SlackResponse {

    private List<DirectMessageChannel> ims;

    public ListChannelsResponse() {
    }

    public List<DirectMessageChannel> getIms() {
        return ims;
    }

    public void setIms(List<DirectMessageChannel> ims) {
        this.ims = ims;
    }

    @Override
    public String toString() {
        return "ListChannelsResponse{" +
                "ims=" + ims +
                "} " + super.toString();
    }
}
