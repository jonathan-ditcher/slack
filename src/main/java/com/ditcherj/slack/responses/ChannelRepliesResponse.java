package com.ditcherj.slack.responses;

import com.ditcherj.slack.dto.MessageEvent;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Created by jon on 26/03/2017.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class ChannelRepliesResponse extends SlackResponse {

    private List<MessageEvent> messages;

    public ChannelRepliesResponse() {
    }

    public List<MessageEvent> getMessages() {
        return messages;
    }

    public void setMessages(List<MessageEvent> messages) {
        this.messages = messages;
    }

    @Override
    public String toString() {
        return "ChannelRepliesResponse{" +
                "messages=" + messages +
                '}';
    }
}
