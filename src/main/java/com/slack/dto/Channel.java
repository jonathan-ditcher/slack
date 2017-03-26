package com.slack.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jonathanditcher
 * Date: 24/03/17
 * Time: 12:06
 * To change this template use File | Settings | File Templates.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class Channel {

    private String id;
    private String name;
    private Boolean is_channel;
    private Long created;
    private String creator;
    private Boolean is_archived;
    private Boolean is_general;
    private List<String> members;
    private Topic topic;
    private Purpose purpose;
    private Boolean is_member;
    private Double last_read;
    private Integer unread_count;
    private Integer unread_count_display;

    public Channel() {
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

    public Boolean getIs_channel() {
        return is_channel;
    }

    public void setIs_channel(Boolean is_channel) {
        this.is_channel = is_channel;
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

    public Boolean getIs_general() {
        return is_general;
    }

    public void setIs_general(Boolean is_general) {
        this.is_general = is_general;
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

    public Boolean getIs_member() {
        return is_member;
    }

    public void setIs_member(Boolean is_member) {
        this.is_member = is_member;
    }

    public Double getLast_read() {
        return last_read;
    }

    public void setLast_read(Double last_read) {
        this.last_read = last_read;
    }

    public Integer getUnread_count() {
        return unread_count;
    }

    public void setUnread_count(Integer unread_count) {
        this.unread_count = unread_count;
    }

    public Integer getUnread_count_display() {
        return unread_count_display;
    }

    public void setUnread_count_display(Integer unread_count_display) {
        this.unread_count_display = unread_count_display;
    }

    @Override
    public String toString() {
        return "Channel{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", is_channel=" + is_channel +
                ", created=" + created +
                ", creator='" + creator + '\'' +
                ", is_archived=" + is_archived +
                ", is_general=" + is_general +
                ", members=" + members +
                ", topic=" + topic +
                ", purpose=" + purpose +
                ", is_member=" + is_member +
                ", last_read=" + last_read +
                ", unread_count=" + unread_count +
                ", unread_count_display=" + unread_count_display +
                '}';
    }

    public static class Topic {

        private String value;
        private String creator;
        private Long last_set;

        public Topic() {
        }

        public String getCreator() {
            return creator;
        }

        public void setCreator(String creator) {
            this.creator = creator;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public Long getLast_set() {
            return last_set;
        }

        public void setLast_set(Long last_set) {
            this.last_set = last_set;
        }

        @Override
        public String toString() {
            return "Topic{" +
                    "value='" + value + '\'' +
                    ", creator='" + creator + '\'' +
                    ", last_set=" + last_set +
                    '}';
        }
    }

    public static class Purpose {

        private String value;
        private String creator;
        private Long last_set;

        public Purpose() {
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getCreator() {
            return creator;
        }

        public void setCreator(String creator) {
            this.creator = creator;
        }

        public Long getLast_set() {
            return last_set;
        }

        public void setLast_set(Long last_set) {
            this.last_set = last_set;
        }

        @Override
        public String toString() {
            return "Purpose{" +
                    "value='" + value + '\'' +
                    ", creator='" + creator + '\'' +
                    ", last_set=" + last_set +
                    '}';
        }
    }
}
