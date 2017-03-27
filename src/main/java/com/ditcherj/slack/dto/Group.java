package com.ditcherj.slack.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Created by jon on 27/03/2017.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class Group {

    private String id;
    private String name;
    private Boolean is_group;
    private Long created;
    private String creator;
    private Boolean is_archived;
    private Boolean is_mpim;
    private List<String> members;
    private Topic topic;
    private Purpose purpose;
    private String last_read;
    private String unread_count;
    private String unread_count_display;

    public Group() {
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

    public Boolean getIs_group() {
        return is_group;
    }

    public void setIs_group(Boolean is_group) {
        this.is_group = is_group;
    }

    public Long getCreated() {
        return created;
    }

    public void setCreated(Long created) {
        this.created = created;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Boolean getIs_archived() {
        return is_archived;
    }

    public void setIs_archived(Boolean is_archived) {
        this.is_archived = is_archived;
    }

    public Boolean getIs_mpim() {
        return is_mpim;
    }

    public void setIs_mpim(Boolean is_mpim) {
        this.is_mpim = is_mpim;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public Purpose getPurpose() {
        return purpose;
    }

    public void setPurpose(Purpose purpose) {
        this.purpose = purpose;
    }

    public String getLast_read() {
        return last_read;
    }

    public void setLast_read(String last_read) {
        this.last_read = last_read;
    }

    public String getUnread_count() {
        return unread_count;
    }

    public void setUnread_count(String unread_count) {
        this.unread_count = unread_count;
    }

    public String getUnread_count_display() {
        return unread_count_display;
    }

    public void setUnread_count_display(String unread_count_display) {
        this.unread_count_display = unread_count_display;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", is_group=" + is_group +
                ", created=" + created +
                ", creator='" + creator + '\'' +
                ", is_archived=" + is_archived +
                ", is_mpim=" + is_mpim +
                ", members=" + members +
                ", topic=" + topic +
                ", purpose=" + purpose +
                ", last_read='" + last_read + '\'' +
                ", unread_count='" + unread_count + '\'' +
                ", unread_count_display='" + unread_count_display + '\'' +
                '}';
    }
}
