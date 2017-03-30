package com.ditcherj.slack.responses;

import com.ditcherj.slack.dto.Reminder;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Created by jon on 29/03/2017.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class ListRemindersResponse extends SlackResponse {

    private List<Reminder> reminders;

    public ListRemindersResponse() {
    }

    public List<Reminder> getReminders() {
        return reminders;
    }

    public void setReminders(List<Reminder> reminders) {
        this.reminders = reminders;
    }

    @Override
    public String toString() {
        return "ListRemindersResponse{" +
                "reminders=" + reminders +
                "} " + super.toString();
    }
}
