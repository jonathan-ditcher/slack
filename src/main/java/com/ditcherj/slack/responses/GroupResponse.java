package com.ditcherj.slack.responses;

import com.ditcherj.slack.dto.Group;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by jon on 27/03/2017.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class GroupResponse extends SlackResponse {

    private Group group;

    public GroupResponse() {
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "GroupResponse{" +
                "group=" + group +
                '}';
    }
}
