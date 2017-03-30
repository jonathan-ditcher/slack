package com.ditcherj.slack.responses;

import com.ditcherj.slack.dto.Pin;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Created by jon on 29/03/2017.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class ListPinsResponse extends SlackResponse {

    private List<Pin> items;

    public ListPinsResponse() {
    }

    public List<Pin> getItems() {
        return items;
    }

    public void setItems(List<Pin> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "ListPinsResponse{" +
                "items=" + items +
                "} " + super.toString();
    }
}
