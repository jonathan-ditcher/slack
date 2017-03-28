package com.ditcherj.slack.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created with IntelliJ IDEA.
 * User: jonathanditcher
 * Date: 24/03/17
 * Time: 10:56
 * To change this template use File | Settings | File Templates.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class DirectMessageChannel extends Channel {

    private Boolean is_im;
    private String user;
    private Boolean is_user_deleted;

    public DirectMessageChannel() {
    }

    public Boolean getIs_im() {
        return is_im;
    }

    public void setIs_im(Boolean is_im) {
        this.is_im = is_im;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Boolean getIs_user_deleted() {
        return is_user_deleted;
    }

    public void setIs_user_deleted(Boolean is_user_deleted) {
        this.is_user_deleted = is_user_deleted;
    }

    @Override
    public String toString() {
        return "DirectMessageChannel{" +
                "is_im=" + is_im +
                ", user='" + user + '\'' +
                ", is_user_deleted=" + is_user_deleted +
                "} " + super.toString();
    }
}

