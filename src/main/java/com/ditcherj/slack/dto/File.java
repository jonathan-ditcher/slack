package com.ditcherj.slack.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Created by jon on 27/03/2017.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class File {

    private String id;
    private Long timestamp;
    private String name;
    private String title;
    private String mimetype;
    private String filetype;
    private String pretty_type;
    private String user;
    private String mode;
    private Boolean editable;
    private Boolean is_external;
    private String external_type;
    private Long size;
    private String url;
    private String url_download;
    private String url_private;
    private String url_private_download;
    private String thumb_64;
    private String thumb_80;
    private String thumb_360;
    private String thumb_360_gif;
    private Integer thumb_360_w;
    private Integer thumb_360_h;
    private String thumb_480;
    private Integer thumb_480_w;
    private Integer thumb_480_h;
    private String permalink;
    private String edit_link;
    private String preview;
    private String preview_highlight;
    private Integer lines;
    private Integer lines_more;
    private Boolean is_public;
    private Boolean public_url_shared;
    private Boolean display_as_bot;
    private List<String> channels;
    private List<String> groups;
    private List<String> ims;
    private Comment initial_comment;
    private Integer num_stars;
    private Boolean is_starred;
    private List<String> pinned_to;
    private List<Reaction> reactions;
    private Integer comments_count;

    public File() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMimetype() {
        return mimetype;
    }

    public void setMimetype(String mimetype) {
        this.mimetype = mimetype;
    }

    public String getFiletype() {
        return filetype;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype;
    }

    public String getPretty_type() {
        return pretty_type;
    }

    public void setPretty_type(String pretty_type) {
        this.pretty_type = pretty_type;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public Boolean getEditable() {
        return editable;
    }

    public void setEditable(Boolean editable) {
        this.editable = editable;
    }

    public Boolean getIs_external() {
        return is_external;
    }

    public void setIs_external(Boolean is_external) {
        this.is_external = is_external;
    }

    public String getExternal_type() {
        return external_type;
    }

    public void setExternal_type(String external_type) {
        this.external_type = external_type;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl_download() {
        return url_download;
    }

    public void setUrl_download(String url_download) {
        this.url_download = url_download;
    }

    public String getUrl_private() {
        return url_private;
    }

    public void setUrl_private(String url_private) {
        this.url_private = url_private;
    }

    public String getUrl_private_download() {
        return url_private_download;
    }

    public void setUrl_private_download(String url_private_download) {
        this.url_private_download = url_private_download;
    }

    public String getThumb_64() {
        return thumb_64;
    }

    public void setThumb_64(String thumb_64) {
        this.thumb_64 = thumb_64;
    }

    public String getThumb_80() {
        return thumb_80;
    }

    public void setThumb_80(String thumb_80) {
        this.thumb_80 = thumb_80;
    }

    public String getThumb_360() {
        return thumb_360;
    }

    public void setThumb_360(String thumb_360) {
        this.thumb_360 = thumb_360;
    }

    public String getThumb_360_gif() {
        return thumb_360_gif;
    }

    public void setThumb_360_gif(String thumb_360_gif) {
        this.thumb_360_gif = thumb_360_gif;
    }

    public Integer getThumb_360_w() {
        return thumb_360_w;
    }

    public void setThumb_360_w(Integer thumb_360_w) {
        this.thumb_360_w = thumb_360_w;
    }

    public Integer getThumb_360_h() {
        return thumb_360_h;
    }

    public void setThumb_360_h(Integer thumb_360_h) {
        this.thumb_360_h = thumb_360_h;
    }

    public String getThumb_480() {
        return thumb_480;
    }

    public void setThumb_480(String thumb_480) {
        this.thumb_480 = thumb_480;
    }

    public Integer getThumb_480_w() {
        return thumb_480_w;
    }

    public void setThumb_480_w(Integer thumb_480_w) {
        this.thumb_480_w = thumb_480_w;
    }

    public Integer getThumb_480_h() {
        return thumb_480_h;
    }

    public void setThumb_480_h(Integer thumb_480_h) {
        this.thumb_480_h = thumb_480_h;
    }

    public String getPermalink() {
        return permalink;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public String getEdit_link() {
        return edit_link;
    }

    public void setEdit_link(String edit_link) {
        this.edit_link = edit_link;
    }

    public String getPreview() {
        return preview;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }

    public String getPreview_highlight() {
        return preview_highlight;
    }

    public void setPreview_highlight(String preview_highlight) {
        this.preview_highlight = preview_highlight;
    }

    public Integer getLines() {
        return lines;
    }

    public void setLines(Integer lines) {
        this.lines = lines;
    }

    public Integer getLines_more() {
        return lines_more;
    }

    public void setLines_more(Integer lines_more) {
        this.lines_more = lines_more;
    }

    public Boolean getIs_public() {
        return is_public;
    }

    public void setIs_public(Boolean is_public) {
        this.is_public = is_public;
    }

    public Boolean getPublic_url_shared() {
        return public_url_shared;
    }

    public void setPublic_url_shared(Boolean public_url_shared) {
        this.public_url_shared = public_url_shared;
    }

    public Boolean getDisplay_as_bot() {
        return display_as_bot;
    }

    public void setDisplay_as_bot(Boolean display_as_bot) {
        this.display_as_bot = display_as_bot;
    }

    public List<String> getChannels() {
        return channels;
    }

    public void setChannels(List<String> channels) {
        this.channels = channels;
    }

    public List<String> getGroups() {
        return groups;
    }

    public void setGroups(List<String> groups) {
        this.groups = groups;
    }

    public List<String> getIms() {
        return ims;
    }

    public void setIms(List<String> ims) {
        this.ims = ims;
    }

    public Comment getInitial_comment() {
        return initial_comment;
    }

    public void setInitial_comment(Comment initial_comment) {
        this.initial_comment = initial_comment;
    }

    public Integer getNum_stars() {
        return num_stars;
    }

    public void setNum_stars(Integer num_stars) {
        this.num_stars = num_stars;
    }

    public Boolean getIs_starred() {
        return is_starred;
    }

    public void setIs_starred(Boolean is_starred) {
        this.is_starred = is_starred;
    }

    public List<String> getPinned_to() {
        return pinned_to;
    }

    public void setPinned_to(List<String> pinned_to) {
        this.pinned_to = pinned_to;
    }

    public List<Reaction> getReactions() {
        return reactions;
    }

    public void setReactions(List<Reaction> reactions) {
        this.reactions = reactions;
    }

    public Integer getComments_count() {
        return comments_count;
    }

    public void setComments_count(Integer comments_count) {
        this.comments_count = comments_count;
    }

    @Override
    public String toString() {
        return "File{" +
                "id='" + id + '\'' +
                ", timestamp=" + timestamp +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", mimetype='" + mimetype + '\'' +
                ", filetype='" + filetype + '\'' +
                ", pretty_type='" + pretty_type + '\'' +
                ", user='" + user + '\'' +
                ", mode='" + mode + '\'' +
                ", editable=" + editable +
                ", is_external=" + is_external +
                ", external_type='" + external_type + '\'' +
                ", size=" + size +
                ", url='" + url + '\'' +
                ", url_download='" + url_download + '\'' +
                ", url_private='" + url_private + '\'' +
                ", url_private_download='" + url_private_download + '\'' +
                ", thumb_64='" + thumb_64 + '\'' +
                ", thumb_80='" + thumb_80 + '\'' +
                ", thumb_360='" + thumb_360 + '\'' +
                ", thumb_360_gif='" + thumb_360_gif + '\'' +
                ", thumb_360_w=" + thumb_360_w +
                ", thumb_360_h=" + thumb_360_h +
                ", thumb_480='" + thumb_480 + '\'' +
                ", thumb_480_w=" + thumb_480_w +
                ", thumb_480_h=" + thumb_480_h +
                ", permalink='" + permalink + '\'' +
                ", edit_link='" + edit_link + '\'' +
                ", preview='" + preview + '\'' +
                ", preview_highlight='" + preview_highlight + '\'' +
                ", lines=" + lines +
                ", lines_more=" + lines_more +
                ", is_public=" + is_public +
                ", public_url_shared=" + public_url_shared +
                ", display_as_bot=" + display_as_bot +
                ", channels=" + channels +
                ", groups=" + groups +
                ", ims=" + ims +
                ", initial_comment=" + initial_comment +
                ", num_stars=" + num_stars +
                ", is_starred=" + is_starred +
                ", pinned_to=" + pinned_to +
                ", reactions=" + reactions +
                ", comments_count=" + comments_count +
                '}';
    }
}
