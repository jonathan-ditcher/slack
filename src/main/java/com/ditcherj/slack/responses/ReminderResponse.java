package com.ditcherj.slack.responses;

import com.ditcherj.slack.dto.Reminder;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by jon on 29/03/2017.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class ReminderResponse extends SlackResponse {

    private Reminder reminder;

    public ReminderResponse() {
    }

    public Reminder getReminder() {
        return reminder;
    }

    public void setReminder(Reminder reminder) {
        this.reminder = reminder;
    }

    @Override
    public String toString() {
        return "ReminderResponse{" +
                "reminder=" + reminder +
                "} " + super.toString();
    }
}
