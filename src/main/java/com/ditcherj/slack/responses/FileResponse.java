package com.ditcherj.slack.responses;

import com.ditcherj.slack.dto.Comment;
import com.ditcherj.slack.dto.File;
import com.ditcherj.slack.dto.Paging;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Created by jon on 27/03/2017.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class FileResponse extends SlackResponse {

    private File file;
    private List<Comment> comments;
    private Paging paging;

    public FileResponse() {
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public Paging getPaging() {
        return paging;
    }

    public void setPaging(Paging paging) {
        this.paging = paging;
    }

    @Override
    public String toString() {
        return "FileResponse{" +
                "file=" + file +
                ", comments=" + comments +
                ", paging=" + paging +
                '}';
    }
}
