package com.ditcherj.slack.responses;

import com.ditcherj.slack.dto.Group;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Created by jon on 27/03/2017.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class GroupsListResponse extends SlackResponse {

    private List<Group> groups;

    public GroupsListResponse() {
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "GroupsListResponse{" +
                "groups=" + groups +
                '}';
    }
}
