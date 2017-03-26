package com.slack.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created with IntelliJ IDEA.
 * User: jonathanditcher
 * Date: 24/03/17
 * Time: 11:09
 * To change this template use File | Settings | File Templates.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class SlackUser {

    private String id;
    private String name;
    private Boolean deleted;
    private String color;
    private Boolean is_admin;
    private Boolean is_owner;
    private Boolean is_primary_owner;
    private Boolean is_ultra_restricted;
    private Long updated;
    private Boolean has_2fa;
    private String two_factor_type;
    private SlackUserProfile profile;

    public SlackUser() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getIs_admin() {
        return is_admin;
    }

    public void setIs_admin(Boolean is_admin) {
        this.is_admin = is_admin;
    }

    public Boolean getIs_owner() {
        return is_owner;
    }

    public void setIs_owner(Boolean is_owner) {
        this.is_owner = is_owner;
    }

    public Boolean getIs_primary_owner() {
        return is_primary_owner;
    }

    public void setIs_primary_owner(Boolean is_primary_owner) {
        this.is_primary_owner = is_primary_owner;
    }

    public Boolean getIs_ultra_restricted() {
        return is_ultra_restricted;
    }

    public void setIs_ultra_restricted(Boolean is_ultra_restricted) {
        this.is_ultra_restricted = is_ultra_restricted;
    }

    public Long getUpdated() {
        return updated;
    }

    public void setUpdated(Long updated) {
        this.updated = updated;
    }

    public Boolean getHas_2fa() {
        return has_2fa;
    }

    public void setHas_2fa(Boolean has_2fa) {
        this.has_2fa = has_2fa;
    }

    public String getTwo_factor_type() {
        return two_factor_type;
    }

    public void setTwo_factor_type(String two_factor_type) {
        this.two_factor_type = two_factor_type;
    }

    public SlackUserProfile getProfile() {
        return profile;
    }

    public void setProfile(SlackUserProfile profile) {
        this.profile = profile;
    }

    @Override
    public String toString() {
        return "SlackUser{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", deleted=" + deleted +
                ", color='" + color + '\'' +
                ", is_admin=" + is_admin +
                ", is_owner=" + is_owner +
                ", is_primary_owner=" + is_primary_owner +
                ", is_ultra_restricted=" + is_ultra_restricted +
                ", updated=" + updated +
                ", has_2fa=" + has_2fa +
                ", two_factor_type='" + two_factor_type + '\'' +
                ", profile=" + profile +
                '}';
    }
}
