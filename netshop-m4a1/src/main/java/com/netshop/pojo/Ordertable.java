package com.netshop.pojo;

import java.io.Serializable;
import java.util.Date;

public class Ordertable implements Serializable {
    private Long orderid;

    private Integer customerid;

    private Byte status;

    private Double totalprice;

    private Integer rewordpoints;

    private Date createtime;

    private Date updatetime;

    public Long getOrderid() {
        return orderid;
    }

    public void setOrderid(Long orderid) {
        this.orderid = orderid;
    }

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Double getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(Double totalprice) {
        this.totalprice = totalprice;
    }

    public Integer getRewordpoints() {
        return rewordpoints;
    }

    public void setRewordpoints(Integer rewordpoints) {
        this.rewordpoints = rewordpoints;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}