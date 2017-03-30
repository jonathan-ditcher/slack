package com.ditcherj.slack.responses;

import com.ditcherj.slack.dto.MessageEvent;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Created by jon on 26/03/2017.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class ChannelHistoryResponse extends SlackResponse {

    private Double latest;
    private List<MessageEvent> messages;
    private Boolean has_more;

    public ChannelHistoryResponse() {
    }

    public Double getLatest() {
        return latest;
    }

    public void setLatest(Double latest) {
        this.latest = latest;
    }

    public List<MessageEvent> getMessages() {
        return messages;
    }

    public void setMessages(List<MessageEvent> messages) {
        this.messages = messages;
    }

    public Boolean getHas_more() {
        return has_more;
    }

    public void setHas_more(Boolean has_more) {
        this.has_more = has_more;
    }

    @Override
    public String toString() {
        return "ChannelHistoryResponse{" +
                "latest=" + latest +
                ", messages=" + messages +
                ", has_more=" + has_more +
                "} " + super.toString();
    }
}
