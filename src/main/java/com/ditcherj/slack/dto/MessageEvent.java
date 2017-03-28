package com.ditcherj.slack.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Created by jon on 26/03/2017.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class MessageEvent {

    private String type;
    private String subtype;
    private String channel;
    private String user;
    private String text;
    private Long ts;
    private Long deleted_ts;
    private Long event_ts;
    private Boolean is_starred;
    private Boolean hidden;
    private Edit edited;
    private List<String> pinned_to;
    private List<Reaction> reactions;

    public MessageEvent() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Long getTs() {
        return ts;
    }

    public void setTs(Long ts) {
        this.ts = ts;
    }

    public Long getDeleted_ts() {
        return deleted_ts;
    }

    public void setDeleted_ts(Long deleted_ts) {
        this.deleted_ts = deleted_ts;
    }

    public Long getEvent_ts() {
        return event_ts;
    }

    public void setEvent_ts(Long event_ts) {
        this.event_ts = event_ts;
    }

    public Boolean getIs_starred() {
        return is_starred;
    }

    public void setIs_starred(Boolean is_starred) {
        this.is_starred = is_starred;
    }

    public Boolean getHidden() {
        return hidden;
    }

    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    public Edit getEdited() {
        return edited;
    }

    public void setEdited(Edit edited) {
        this.edited = edited;
    }

    public List<String> getPinned_to() {
        return pinned_to;
    }

    public void setPinned_to(List<String> pinned_to) {
        this.pinned_to = pinned_to;
    }

    public List<Reaction> getReactions() {
        return reactions;
    }

    public void setReactions(List<Reaction> reactions) {
        this.reactions = reactions;
    }


    @Override
    public String toString() {
        return "MessageEvent{" +
                "type='" + type + '\'' +
                ", subtype='" + subtype + '\'' +
                ", channel='" + channel + '\'' +
                ", user='" + user + '\'' +
                ", text='" + text + '\'' +
                ", ts=" + ts +
                ", deleted_ts=" + deleted_ts +
                ", event_ts=" + event_ts +
                ", is_starred=" + is_starred +
                ", hidden=" + hidden +
                ", edited=" + edited +
                ", pinned_to=" + pinned_to +
                ", reactions=" + reactions +
                '}';
    }


    public static class Edit {

        private String user;
        private Long ts;

        public Edit() {
        }

        public String getUser() {
            return user;
        }

        public void setUser(String user) {
            this.user = user;
        }

        public Long getTs() {
            return ts;
        }

        public void setTs(Long ts) {
            this.ts = ts;
        }

        @Override
        public String toString() {
            return "Edit{" +
                    "user='" + user + '\'' +
                    ", ts=" + ts +
                    '}';
        }
    }

}
