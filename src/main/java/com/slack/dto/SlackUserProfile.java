package com.slack.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created with IntelliJ IDEA.
 * User: jonathanditcher
 * Date: 24/03/17
 * Time: 11:12
 * To change this template use File | Settings | File Templates.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class SlackUserProfile {

    private String first_name;
    private String last_name;
    private String real_name;
    private String email;
    private String skype;
    private String phone;
    private String image_24;
    private String image_32;
    private String image_48;
    private String image_72;
    private String image_192;
    private String image_512;

    public SlackUserProfile() {
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getReal_name() {
        return real_name;
    }

    public void setReal_name(String real_name) {
        this.real_name = real_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImage_24() {
        return image_24;
    }

    public void setImage_24(String image_24) {
        this.image_24 = image_24;
    }

    public String getImage_32() {
        return image_32;
    }

    public void setImage_32(String image_32) {
        this.image_32 = image_32;
    }

    public String getImage_48() {
        return image_48;
    }

    public void setImage_48(String image_48) {
        this.image_48 = image_48;
    }

    public String getImage_72() {
        return image_72;
    }

    public void setImage_72(String image_72) {
        this.image_72 = image_72;
    }

    public String getImage_192() {
        return image_192;
    }

    public void setImage_192(String image_192) {
        this.image_192 = image_192;
    }

    public String getImage_512() {
        return image_512;
    }

    public void setImage_512(String image_512) {
        this.image_512 = image_512;
    }

    @Override
    public String toString() {
        return "SlackUserProfile{" +
                "first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", real_name='" + real_name + '\'' +
                ", email='" + email + '\'' +
                ", skype='" + skype + '\'' +
                ", phone='" + phone + '\'' +
                ", image_24='" + image_24 + '\'' +
                ", image_32='" + image_32 + '\'' +
                ", image_48='" + image_48 + '\'' +
                ", image_72='" + image_72 + '\'' +
                ", image_192='" + image_192 + '\'' +
                ", image_512='" + image_512 + '\'' +
                '}';
    }
}
