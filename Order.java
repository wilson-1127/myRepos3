package com.item.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Order {

    private int id;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date ordertime;
    private String ordertimeStr;
    private int total;

    private int uid;

    private User user;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getOrdertimeStr() {

        if (ordertime!=null) {

            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");

            ordertimeStr = sdf.format(ordertime);
        }

        return ordertimeStr;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


}
