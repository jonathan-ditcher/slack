package com.slack.dto;

import com.slack.dto.DirectMessageChannel;
import com.slack.dto.SlackUser;

/**
 * Created with IntelliJ IDEA.
 * User: jonathanditcher
 * Date: 24/03/17
 * Time: 12:06
 * To change this template use File | Settings | File Templates.
 */
public class Channel {

    private DirectMessageChannel directMessageChannel;
    private SlackUser slackUser;

    public Channel(DirectMessageChannel directMessageChannel, SlackUser slackUser) {
        this.directMessageChannel = directMessageChannel;
        this.slackUser = slackUser;
    }

    public DirectMessageChannel getDirectMessageChannel() {
        return directMessageChannel;
    }

    public void setDirectMessageChannel(DirectMessageChannel directMessageChannel) {
        this.directMessageChannel = directMessageChannel;
    }

    public SlackUser getSlackUser() {
        return slackUser;
    }

    public void setSlackUser(SlackUser slackUser) {
        this.slackUser = slackUser;
    }

    @Override
    public String toString() {
        return "Channel{" +
                "directMessageChannel=" + directMessageChannel +
                ", slackUser=" + slackUser +
                '}';
    }
}
