package com.slack.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by jon on 26/03/2017.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class ChannelInfoResponse extends SlackResponse {

    private Channel channel;

    public ChannelInfoResponse() {
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    @Override
    public String toString() {
        return "ChannelInfoResponse{" +
                "channel=" + channel +
                '}';
    }
}