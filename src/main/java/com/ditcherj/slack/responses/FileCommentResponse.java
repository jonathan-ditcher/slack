package com.ditcherj.slack.responses;

import com.ditcherj.slack.dto.Comment;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by jon on 27/03/2017.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class FileCommentResponse extends SlackResponse {

    private Comment comment;

    public FileCommentResponse() {
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "FileCommentResponse{" +
                "comment=" + comment +
                '}';
    }
}
