package com.netshop.pojo;

import java.io.Serializable;

public class Product implements Serializable {
    private Integer productid;

    private String productcode;

    private String productname;

    private String productabstract;

    private Double price;

    private Double discount;

    private Integer stockquantity;

    private Byte status;

    private String mainpicurl;

    private Integer rewordpoints;

    private Integer sortorder;

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public String getProductcode() {
        return productcode;
    }

    public void setProductcode(String productcode) {
        this.productcode = productcode == null ? null : productcode.trim();
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    public String getProductabstract() {
        return productabstract;
    }

    public void setProductabstract(String productabstract) {
        this.productabstract = productabstract == null ? null : productabstract.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Integer getStockquantity() {
        return stockquantity;
    }

    public void setStockquantity(Integer stockquantity) {
        this.stockquantity = stockquantity;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getMainpicurl() {
        return mainpicurl;
    }

    public void setMainpicurl(String mainpicurl) {
        this.mainpicurl = mainpicurl == null ? null : mainpicurl.trim();
    }

    public Integer getRewordpoints() {
        return rewordpoints;
    }

    public void setRewordpoints(Integer rewordpoints) {
        this.rewordpoints = rewordpoints;
    }

    public Integer getSortorder() {
        return sortorder;
    }

    public void setSortorder(Integer sortorder) {
        this.sortorder = sortorder;
    }
}