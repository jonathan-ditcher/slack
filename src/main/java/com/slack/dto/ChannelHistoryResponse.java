package com.slack.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Created by jon on 26/03/2017.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class ChannelHistoryResponse extends SlackResponse {

    private Long latest;
    private List<MessageEvent> messages;

    public ChannelHistoryResponse() {
    }

    public Long getLatest() {
        return latest;
    }

    public void setLatest(Long latest) {
        this.latest = latest;
    }

    public List<MessageEvent> getMessages() {
        return messages;
    }

    public void setMessages(List<MessageEvent> messages) {
        this.messages = messages;
    }

    @Override
    public String toString() {
        return "ChannelHistoryResponse{" +
                "latest=" + latest +
                ", messages=" + messages +
                '}';
    }
}
