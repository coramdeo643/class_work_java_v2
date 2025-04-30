package com.mytest;

import com.access.Bank;

public class MainTest1 {
    // main entry
    public static void main(String[] args) {

        Bank bank2 = new Bank();
        // class "Bank" is in package "access"
        // we are in package "mytest" now
        // bank2.balance = 10; balance is not accessible bc it is default
        bank2.name = "Teemo"; // public is accessible in anywhere

    } // end of main
} // end of class
