package com.ditcherj.slack.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by jon on 29/03/2017.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class Pin {

    private String type;
    private String channel;
    private MessageEvent message;
    private Long created;
    private String created_by;

    public Pin() {
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

    public Long getCreated() {
        return created;
    }

    public void setCreated(Long created) {
        this.created = created;
    }

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }

    @Override
    public String toString() {
        return "Pin{" +
                "type='" + type + '\'' +
                ", channel='" + channel + '\'' +
                ", message=" + message +
                ", created=" + created +
                ", created_by='" + created_by + '\'' +
                '}';
    }
}
