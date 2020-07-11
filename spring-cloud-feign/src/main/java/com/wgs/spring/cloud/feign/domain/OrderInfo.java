package com.wgs.spring.cloud.feign.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author: wanggenshen
 * @date: 2020/7/11 13:22.
 * @description: 订单信息
 */
public class OrderInfo {

    private String orderNo;
    private BigDecimal money;
    private String userName;
    private Date date;

    public OrderInfo(String orderNo, BigDecimal money, String userName, Date date) {
        this.orderNo = orderNo;
        this.money = money;
        this.userName = userName;
        this.date = date;
    }

    public OrderInfo() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderInfo orderInfo = (OrderInfo) o;

        if (orderNo != null ? !orderNo.equals(orderInfo.orderNo) : orderInfo.orderNo != null) return false;
        if (money != null ? !money.equals(orderInfo.money) : orderInfo.money != null) return false;
        if (userName != null ? !userName.equals(orderInfo.userName) : orderInfo.userName != null) return false;
        return date != null ? date.equals(orderInfo.date) : orderInfo.date == null;

    }

    @Override
    public int hashCode() {
        int result = orderNo != null ? orderNo.hashCode() : 0;
        result = 31 * result + (money != null ? money.hashCode() : 0);
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "OrderInfo{" +
                "orderNo='" + orderNo + '\'' +
                ", money=" + money +
                ", userName='" + userName + '\'' +
                ", date=" + date +
                '}';
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }



}
