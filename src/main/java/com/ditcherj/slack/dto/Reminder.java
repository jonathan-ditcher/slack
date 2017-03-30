package com.ditcherj.slack.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by jon on 29/03/2017.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class Reminder {

    private String id;
    private String creator;
    private String user;
    private String text;
    private Boolean recurring;
    private Long time;
    private Long complete_ts;

    public Reminder() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
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

    public Boolean getRecurring() {
        return recurring;
    }

    public void setRecurring(Boolean recurring) {
        this.recurring = recurring;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Long getComplete_ts() {
        return complete_ts;
    }

    public void setComplete_ts(Long complete_ts) {
        this.complete_ts = complete_ts;
    }

    @Override
    public String toString() {
        return "Reminder{" +
                "id='" + id + '\'' +
                ", creator='" + creator + '\'' +
                ", user='" + user + '\'' +
                ", text='" + text + '\'' +
                ", recurring=" + recurring +
                ", time=" + time +
                ", complete_ts=" + complete_ts +
                '}';
    }
}
