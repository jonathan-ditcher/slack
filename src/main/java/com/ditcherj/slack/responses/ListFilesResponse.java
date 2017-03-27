package com.ditcherj.slack.responses;

import com.ditcherj.slack.dto.File;
import com.ditcherj.slack.dto.Paging;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Created by jon on 27/03/2017.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class ListFilesResponse extends SlackResponse {

    private List<File> files;
    private Paging paging;

    public ListFilesResponse() {
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public Paging getPaging() {
        return paging;
    }

    public void setPaging(Paging paging) {
        this.paging = paging;
    }

    @Override
    public String toString() {
        return "ListFilesResponse{" +
                "files=" + files +
                ", paging=" + paging +
                '}';
    }
}
