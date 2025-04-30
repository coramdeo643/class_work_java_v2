package com._this;

public class UserInfoMainTest {
    // main entry
    public static void main(String[] args) {

        UserInfo userInfo = new UserInfo("BE2025","john240416","Bill Evans","New york","010-9333-1333");

        String outerUserId = userInfo.getUserId();
        String outerUserPassword = userInfo.getUserPassword();
        String outerUserName = userInfo.getUserName();
        String outerUserAddress = userInfo.getUserAddress();
        String outerPhoneNumber = userInfo.getPhoneNumber();

        userInfo.setUserId("Identification");
        userInfo.setUserPassword("Id250416");
        userInfo.setUserName("Kim");
        userInfo.setUserAddress("Hawaii");
        userInfo.setPhoneNumber("02-1531-5214");

    } // end of main
} // end of class
