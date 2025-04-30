package com.oop1;

public class Student {
    // property
    private String name;
    private int money;

    // 생성자
    public Student(String name, int money1) {
        this.name = name;
        this.money = money1;
    }

    // 핵심, 버스랑 어떻게 상호작용?
    public void takeBus(Bus bus) {

        int rate = 3500;
        if (this.money < 0 || this.money < rate) {
            System.out.println("<<< Not enough money, Boarding rejected >>>");
        } else {
            bus.take(rate);
            this.money -= rate;
        }

    }

    public void showInfo() {
        System.out.println("> > > STUDENT INFO < < <");
        System.out.println("Student Name : " + name);
        System.out.println("Student Money : " + money);
    }

}
