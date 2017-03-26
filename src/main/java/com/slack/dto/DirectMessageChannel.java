package com.slack.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created with IntelliJ IDEA.
 * User: jonathanditcher
 * Date: 24/03/17
 * Time: 10:56
 * To change this template use File | Settings | File Templates.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class DirectMessageChannel {

    private String id;
    private Boolean is_im;
    private String user;
    private Long created;
    private Boolean is_user_deleted;

    public DirectMessageChannel() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Long getCreated() {
        return created;
    }

    public void setCreated(Long created) {
        this.created = created;
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
                "id='" + id + '\'' +
                ", is_im=" + is_im +
                ", user='" + user + '\'' +
                ", created=" + created +
                ", is_user_deleted=" + is_user_deleted +
                '}';
    }
}

