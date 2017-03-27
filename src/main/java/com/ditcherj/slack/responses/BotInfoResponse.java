package com.ditcherj.slack.responses;

import com.ditcherj.slack.dto.Bot;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by jon on 26/03/2017.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class BotInfoResponse extends SlackResponse {

    private Bot bot;

    public BotInfoResponse() {
    }

    public Bot getBot() {
        return bot;
    }

    public void setBot(Bot bot) {
        this.bot = bot;
    }

    @Override
    public String toString() {
        return "BotInfoResponse{" +
                "bot=" + bot +
                '}';
    }
}
