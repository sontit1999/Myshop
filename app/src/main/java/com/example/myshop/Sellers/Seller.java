package com.example.myshop.Sellers;

public class Seller {
    private String sid;
    private String phone;
    private String email;
    private String name;
    private String address;

    public Seller() {
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Seller(String sid, String phone, String email, String name, String address) {
        this.sid = sid;
        this.phone = phone;
        this.email = email;
        this.name = name;
        this.address = address;
    }
}
