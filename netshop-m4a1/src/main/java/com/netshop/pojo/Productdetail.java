package com.netshop.pojo;

import java.io.Serializable;

public class Productdetail implements Serializable {
    private Integer productid;

    private String otherpicurls;

    private String description;

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public String getOtherpicurls() {
        return otherpicurls;
    }

    public void setOtherpicurls(String otherpicurls) {
        this.otherpicurls = otherpicurls == null ? null : otherpicurls.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}