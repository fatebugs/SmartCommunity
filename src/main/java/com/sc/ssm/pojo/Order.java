package com.sc.ssm.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class Order implements Serializable {
    private String orderUuid;

    private String orderName;

    private String orderPhone;

    private String orderAdress;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date orderTime;

    private String orderRemark;

    private String orderState;

    private static final long serialVersionUID = 1L;

    public String getOrderUuid() {
        return orderUuid;
    }

    public void setOrderUuid(String orderUuid) {
        this.orderUuid = orderUuid;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getOrderPhone() {
        return orderPhone;
    }

    public void setOrderPhone(String orderPhone) {
        this.orderPhone = orderPhone;
    }

    public String getOrderAdress() {
        return orderAdress;
    }

    public void setOrderAdress(String orderAdress) {
        this.orderAdress = orderAdress;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public String getOrderRemark() {
        return orderRemark;
    }

    public void setOrderRemark(String orderRemark) {
        this.orderRemark = orderRemark;
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderUuid=").append(orderUuid);
        sb.append(", orderName=").append(orderName);
        sb.append(", orderPhone=").append(orderPhone);
        sb.append(", orderAdress=").append(orderAdress);
        sb.append(", orderTime=").append(orderTime);
        sb.append(", orderRemark=").append(orderRemark);
        sb.append(", orderState=").append(orderState);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}