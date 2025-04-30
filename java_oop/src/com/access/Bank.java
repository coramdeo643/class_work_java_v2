package com.access;

/**
 * Bank class design code
 * account
 */
public class Bank {

    // Access modifier 접근 제어 지시자(public, default, private)
    // public : anywhere
    public String name; // accessible anyone and anywhere
    // default : only accessible in the same package, access
    int balance;
    // private : only accessible in the same class, Bank
    private String number;

    public void showInfo() {
        System.out.println("현재 계좌번호는 : " + number + " 입니다");
    }

} // end of class
