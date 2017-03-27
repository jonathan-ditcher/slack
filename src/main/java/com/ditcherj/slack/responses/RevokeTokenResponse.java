package com.ditcherj.slack.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by jon on 26/03/2017.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class RevokeTokenResponse extends SlackResponse {

    private Boolean revoked;

    public RevokeTokenResponse() {
    }

    public Boolean getRevoked() {
        return revoked;
    }

    public void setRevoked(Boolean revoked) {
        this.revoked = revoked;
    }

    @Override
    public String toString() {
        return "RevokeTokenResponse{" +
                "revoked=" + revoked +
                '}';
    }
}
