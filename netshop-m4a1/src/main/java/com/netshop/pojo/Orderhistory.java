package com.netshop.pojo;

import java.io.Serializable;
import java.util.Date;

public class Orderhistory implements Serializable {
    private Long orderhistoryid;

    private Long orderid;

    private Date time;

    private Byte orderstatus;

    private String comment;

    private Boolean customernotified;

    public Long getOrderhistoryid() {
        return orderhistoryid;
    }

    public void setOrderhistoryid(Long orderhistoryid) {
        this.orderhistoryid = orderhistoryid;
    }

    public Long getOrderid() {
        return orderid;
    }

    public void setOrderid(Long orderid) {
        this.orderid = orderid;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Byte getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(Byte orderstatus) {
        this.orderstatus = orderstatus;
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