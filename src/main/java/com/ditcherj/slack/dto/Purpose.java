package com.ditcherj.slack.dto;

/**
 * Created by jon on 27/03/2017.
 */
public class Purpose {

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
