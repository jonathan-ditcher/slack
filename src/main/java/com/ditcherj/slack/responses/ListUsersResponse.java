package com.ditcherj.slack.responses;

import com.ditcherj.slack.dto.User;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jonathanditcher
 * Date: 24/03/17
 * Time: 11:08
 * To change this template use File | Settings | File Templates.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class ListUsersResponse extends SlackResponse {

    private List<User> members;

    public ListUsersResponse() {
    }

    public List<User> getMembers() {
        return members;
    }

    public void setMembers(List<User> members) {
        this.members = members;
    }

    @Override
    public String toString() {
        return "ListUsersResponse{" +
                "members=" + members +
                "} " + super.toString();
    }
}
