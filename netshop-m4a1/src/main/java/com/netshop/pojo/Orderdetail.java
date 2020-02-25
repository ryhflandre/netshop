package com.netshop.pojo;

import java.io.Serializable;

public class Orderdetail implements Serializable {
    private Long orderid;

    private Short shipmethod;

    private String shipaddress;

    private Double shipprice;

    private Short paymethod;

    private String invoiceaddress;

    private Double invoiceprice;

    private String comment;

    private Integer productid;

    private String productcode;

    private String productname;

    private Integer quantity;

    private Double unitprice;

    private Integer unitrewordpoints;

    private String orderproducts;

    public Long getOrderid() {
        return orderid;
    }

    public void setOrderid(Long orderid) {
        this.orderid = orderid;
    }

    public Short getShipmethod() {
        return shipmethod;
    }

    public void setShipmethod(Short shipmethod) {
        this.shipmethod = shipmethod;
    }

    public String getShipaddress() {
        return shipaddress;
    }

    public void setShipaddress(String shipaddress) {
        this.shipaddress = shipaddress == null ? null : shipaddress.trim();
    }

    public Double getShipprice() {
        return shipprice;
    }

    public void setShipprice(Double shipprice) {
        this.shipprice = shipprice;
    }

    public Short getPaymethod() {
        return paymethod;
    }

    public void setPaymethod(Short paymethod) {
        this.paymethod = paymethod;
    }

    public String getInvoiceaddress() {
        return invoiceaddress;
    }

    public void setInvoiceaddress(String invoiceaddress) {
        this.invoiceaddress = invoiceaddress == null ? null : invoiceaddress.trim();
    }

    public Double getInvoiceprice() {
        return invoiceprice;
    }

    public void setInvoiceprice(Double invoiceprice) {
        this.invoiceprice = invoiceprice;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(Double unitprice) {
        this.unitprice = unitprice;
    }

    public Integer getUnitrewordpoints() {
        return unitrewordpoints;
    }

    public void setUnitrewordpoints(Integer unitrewordpoints) {
        this.unitrewordpoints = unitrewordpoints;
    }

    public String getOrderproducts() {
        return orderproducts;
    }

    public void setOrderproducts(String orderproducts) {
        this.orderproducts = orderproducts == null ? null : orderproducts.trim();
    }
}