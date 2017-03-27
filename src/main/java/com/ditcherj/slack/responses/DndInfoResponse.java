package com.ditcherj.slack.responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by jon on 27/03/2017.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class DndInfoResponse extends SlackResponse {

    private Boolean dnd_enabled;
    private Long next_dnd_start_ts;
    private Long next_dnd_end_ts;
    private Boolean snooze_enabled;
    private Long snooze_endtime;
    private Integer snooze_remaining;

    public DndInfoResponse() {
    }

    public Boolean getDnd_enabled() {
        return dnd_enabled;
    }

    public void setDnd_enabled(Boolean dnd_enabled) {
        this.dnd_enabled = dnd_enabled;
    }

    public Long getNext_dnd_start_ts() {
        return next_dnd_start_ts;
    }

    public void setNext_dnd_start_ts(Long next_dnd_start_ts) {
        this.next_dnd_start_ts = next_dnd_start_ts;
    }

    public Long getNext_dnd_end_ts() {
        return next_dnd_end_ts;
    }

    public void setNext_dnd_end_ts(Long next_dnd_end_ts) {
        this.next_dnd_end_ts = next_dnd_end_ts;
    }

    public Boolean getSnooze_enabled() {
        return snooze_enabled;
    }

    public void setSnooze_enabled(Boolean snooze_enabled) {
        this.snooze_enabled = snooze_enabled;
    }

    public Long getSnooze_endtime() {
        return snooze_endtime;
    }

    public void setSnooze_endtime(Long snooze_endtime) {
        this.snooze_endtime = snooze_endtime;
    }

    public Integer getSnooze_remaining() {
        return snooze_remaining;
    }

    public void setSnooze_remaining(Integer snooze_remaining) {
        this.snooze_remaining = snooze_remaining;
    }

    @Override
    public String toString() {
        return "DndInfoResponse{" +
                "dnd_enabled=" + dnd_enabled +
                ", next_dnd_start_ts=" + next_dnd_start_ts +
                ", next_dnd_end_ts=" + next_dnd_end_ts +
                ", snooze_enabled=" + snooze_enabled +
                ", snooze_endtime=" + snooze_endtime +
                ", snooze_remaining=" + snooze_remaining +
                '}';
    }
}
