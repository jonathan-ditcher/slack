package com.ditcherj.slack.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Map;

/**
 * Created by jon on 27/03/2017.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class EmojiListResponse extends SlackResponse {

    private Map<String, String> emoji;

    public EmojiListResponse() {
    }

    public Map<String, String> getEmoji() {
        return emoji;
    }

    public void setEmoji(Map<String, String> emoji) {
        this.emoji = emoji;
    }

    @Override
    public String toString() {
        return "EmojiListResponse{" +
                "emoji=" + emoji +
                '}';
    }
}
