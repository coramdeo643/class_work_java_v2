package com._this;

public class UserInfo {

    private String userId;
    private String userPassword;
    private String userName;
    private String userAddress;
    private String phoneNumber;

    // 생성자 매개변수 1 ~ 5개 생성, 생성자 오버로딩
    public UserInfo(String userId) {
        this.userId = userId;
        System.out.println(1);
    }

    public UserInfo(String userId, String userPassword) {
        this(userId);
        this.userPassword = userPassword;
        System.out.println(2);
    }

    public UserInfo(String userId, String userPassword, String userName) {
        this(userId, userPassword);
        this.userName = userName;
        System.out.println(3);
    }

    public UserInfo(String userId, String userPassword, String userName, String userAddress) {
        this(userId, userPassword, userName);
        this.userAddress = userAddress;
        System.out.println(4);
    }

    public UserInfo(String userId, String userPassword, String userName, String userAddress, String phoneNumber) {
        this(userId, userPassword, userName, userAddress);
        this.phoneNumber = phoneNumber;
        System.out.println(5);
    }

    // getter method
    public String getUserId() {
        return userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    // setter method

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void showInfo() {
        System.out.println(" > > > INFO < < < ");
        System.out.println("userId = " + userId);
        System.out.println("userPassword = " + userPassword);
        System.out.println("userName = " + userName);
        System.out.println("userAddress = " + userAddress);
        System.out.println("phoneNumber = " + phoneNumber);

    }

}
