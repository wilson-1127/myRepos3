package com.item.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class User {

    private int id;
    private String username;
    private String password;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
    private String birthdayStr;

    private List<Order> orderList;

    public String getBirthdayStr() {

        if (birthday!=null) {

            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");

            birthdayStr = sdf.format(birthday);
        }

        return birthdayStr;
    }


    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }


}
