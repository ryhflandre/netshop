package com.netshop.pojo;

import java.io.Serializable;
import java.util.Date;

public class Returnhistory implements Serializable {
    private Integer returnhistoryid;

    private Integer returnid;

    private Date time;

    private Byte returnstatus;

    private String comment;

    private Boolean customernotified;

    public Integer getReturnhistoryid() {
        return returnhistoryid;
    }

    public void setReturnhistoryid(Integer returnhistoryid) {
        this.returnhistoryid = returnhistoryid;
    }

    public Integer getReturnid() {
        return returnid;
    }

    public void setReturnid(Integer returnid) {
        this.returnid = returnid;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Byte getReturnstatus() {
        return returnstatus;
    }

    public void setReturnstatus(Byte returnstatus) {
        this.returnstatus = returnstatus;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public Boolean getCustomernotified() {
        return customernotified;
    }

    public void setCustomernotified(Boolean customernotified) {
        this.customernotified = customernotified;
    }
}