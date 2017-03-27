package com.ditcherj.slack.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Created by jon on 27/03/2017.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class Reaction {

    private String name;
    private String count;
    private List<String> users;

    public Reaction() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public List<String> getUsers() {
        return users;
    }

    public void setUsers(List<String> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Reaction{" +
                "name='" + name + '\'' +
                ", count='" + count + '\'' +
                ", users=" + users +
                '}';
    }
}
