package com.example.demo.pojo;

public class Customer {
    private String account;
    private String name;
    private String pwd;
    private String phone;
    private String type;

    public Customer(String account, String pwd) {
        this.account = account;
        this.pwd = pwd;
    }
    public String getPwd() {
        return pwd;
    }

    public String getType() {
        return type;
    }
}
