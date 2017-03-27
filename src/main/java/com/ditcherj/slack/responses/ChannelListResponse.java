package com.ditcherj.slack.responses;

import com.ditcherj.slack.dto.Channel;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Created by jon on 26/03/2017.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class ChannelListResponse extends SlackResponse {

    private List<Channel> channels;

    public ChannelListResponse() {
    }

    public List<Channel> getChannels() {
        return channels;
    }

    public void setChannels(List<Channel> channels) {
        this.channels = channels;
    }

    @Override
    public String toString() {
        return "ChannelListResponse{" +
                "channels=" + channels +
                '}';
    }
}
