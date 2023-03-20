package com.example.fuelmanegementapp.models;

import java.io.Serializable;

public class FuelStation implements Serializable {
    //`sid`, `name`, `email`, `reg_no`, `city`, `address`, `phone`, `lat`, `lon`, `lid`
    private int sid;
    private String name;
    private String reg_no;
    private String email;
    private String city;
    private String phone;
    private String address;
    private String lat;
    private String lon;
    private String opn_cls_status;
    private String queue_status;
    private int lid;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReg_no() {
        return reg_no;
    }

    public void setReg_no(String reg_no) {
        this.reg_no = reg_no;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getOpn_cls_status() {
        return opn_cls_status;
    }

    public void setOpn_cls_status(String opn_cls_status) {
        this.opn_cls_status = opn_cls_status;
    }

    public String getQueue_status() {
        return queue_status;
    }

    public void setQueue_status(String queue_status) {
        this.queue_status = queue_status;
    }
}
