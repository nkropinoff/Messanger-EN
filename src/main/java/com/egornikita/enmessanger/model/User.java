package com.egornikita.enmessanger.model;

public class User {
    private String nickName;
    private String userName;
    private String phoneNumber;
    private String password;

    public User() {}

    public User(String nickName, String userName, String phoneNumber, String password) {
        this.nickName = nickName;
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickName() {
        return nickName;
    }

    public String getUserName() {
        return userName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPassword() {
        return password;
    }

}

