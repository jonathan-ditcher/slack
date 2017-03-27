package com.ditcherj.slack.responses;

import com.ditcherj.slack.dto.Channel;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by jon on 26/03/2017.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class ChannelResponse extends SlackResponse {

    private Channel channel;

    public ChannelResponse() {
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    @Override
    public String toString() {
        return "ChannelResponse{" +
                "channel=" + channel +
                '}';
    }
}

