package com.ditcherj.slack.dto;

/**
 * Created by jon on 26/03/2017.
 */
public enum Scope {

    CHANNELS_HISTORY("channels:history"),
    CHANNELS_READ("channels:read"),
    CHANNELS_WRITE("channels:write"),
    CHAT_WRITE_BOT("chat:write:bot"),
    CHAT_WRITE_USER("chat:write:user"),
    DND_READ("dnd:read"),
    DND_WRITE("dnd:write"),
    EMOJI_READ("emoji:read"),
    FILES_READ("files:read"),
    FILES_WRITE_USER("files:write:user"),
    GROUPS_HISTORY("groups:history"),
    GROUPS_READ("groups:read"),
    GROUPS_WRITE("groups:write"),
    IDENTITY_BASIC("identity.basic"),
    IM_HISTORY("im.history"),
    IM_READ("im:read"),
    IM_WRITE("im:write"),
    LINKS_WRITE("links:write"),
    MPIM_HISTORY("mpim.history"),
    MPIM_READ("mpim:read"),
    MPIM_WRITE("mpim:write"),
    PINS_READ("pins:read"),
    PINS_WRITE("pins:write"),
    REACTIONS_READ("reactions:read"),
    REACTIONS_WRITE("reactions:write"),
    REMINDERS_READ("reminders:read"),
    REMINDERS_WRITE("reminders:write"),
    SEARCH_READ("search:read"),
    STARS_READ("stars:read"),
    STARS_WRITE("stars:write"),
    TEAM_READ("team:read"),
    USERGROUPS_READ("usergroups:read"),
    USERGROUPS_WRITE("usergroups:write"),
    USERS_PROFILE_READ("users.profile:read"),
    USERS_PROFILE_WRITE("users.profile:write"),
    USERS_READ("users:read"),
    USERS_WRITE("users:write");

    private String scope;

    Scope(String scope) {
        this.scope = scope;
    }

    public String getScope() {
        return scope;
    }
}
