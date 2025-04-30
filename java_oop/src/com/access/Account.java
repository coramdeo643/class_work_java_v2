package com.access;

public class Account {

    private String name;
    // int balance; // accessible in same package(default)
    private int balance;

    // getter, setter method
    // 외부에서 balance 값을 리턴 받을수있는 메서드를 만들어보자
    // 변수 앞에 get 단어를 붙인다 (매개변수는 선언할 필요없음)
    public int getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    // setter method
    public void setBalance(int b) {
        // we can write the defensive code
        if (b > 0) {
            System.out.println("0 이하 값을 넣을수없어요");
        } else {
            balance = b;
        }
    }

    public void setName(String n) {
        name = n;
    }

    // deposit
    public void deposit(int money) {
        balance += money;
    }

    // withdraw
    public void withdraw(int money) {
        // TODO defensive code
        if (balance > 0) {
            balance -= money;
        }
    }

    // show the balance
    public void showInfo() {
        System.out.println("Current account balance is : $ " + balance);
    }

} // end of class
