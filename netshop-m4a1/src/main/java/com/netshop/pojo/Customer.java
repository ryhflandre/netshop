package com.netshop.pojo;

import java.io.Serializable;
import java.util.Date;

public class Customer implements Serializable {
    private Integer customerid;

    private String username;

    private String realname;

    private String avatarurl;

    private String encryptedpassword;

    private String mobile;

    private Boolean mobileverified;

    private String email;

    private Boolean emailverified;

    private Byte status;

    private Date createtime;

    private Boolean newssubscribed;

    private Integer rewordpoints;

    private Integer defaultaddressid;

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getAvatarurl() {
        return avatarurl;
    }

    public void setAvatarurl(String avatarurl) {
        this.avatarurl = avatarurl == null ? null : avatarurl.trim();
    }

    public String getEncryptedpassword() {
        return encryptedpassword;
    }

    public void setEncryptedpassword(String encryptedpassword) {
        this.encryptedpassword = encryptedpassword == null ? null : encryptedpassword.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Boolean getMobileverified() {
        return mobileverified;
    }

    public void setMobileverified(Boolean mobileverified) {
        this.mobileverified = mobileverified;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Boolean getEmailverified() {
        return emailverified;
    }

    public void setEmailverified(Boolean emailverified) {
        this.emailverified = emailverified;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Boolean getNewssubscribed() {
        return newssubscribed;
    }

    public void setNewssubscribed(Boolean newssubscribed) {
        this.newssubscribed = newssubscribed;
    }

    public Integer getRewordpoints() {
        return rewordpoints;
    }

    public void setRewordpoints(Integer rewordpoints) {
        this.rewordpoints = rewordpoints;
    }

    public Integer getDefaultaddressid() {
        return defaultaddressid;
    }

    public void setDefaultaddressid(Integer defaultaddressid) {
        this.defaultaddressid = defaultaddressid;
    }
}