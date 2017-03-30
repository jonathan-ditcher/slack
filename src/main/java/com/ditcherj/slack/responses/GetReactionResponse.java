package com.ditcherj.slack.responses;

import com.ditcherj.slack.dto.MessageEvent;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by jon on 29/03/2017.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class GetReactionResponse extends SlackResponse {

    private String type;
    private String channel;
    private MessageEvent message;

    public GetReactionResponse() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public MessageEvent getMessage() {
        return message;
    }

    public void setMessage(MessageEvent message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "GetReactionResponse{" +
                "type='" + type + '\'' +
                ", channel='" + channel + '\'' +
                ", message=" + message +
                "} " + super.toString();
    }
}
