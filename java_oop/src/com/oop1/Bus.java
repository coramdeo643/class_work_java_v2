package com.oop1;

public class Bus {
    // 속성
    private int busNumber;
    private int count;
    private int money;

    // 생성자
    public Bus(int busNumber) {
        this.busNumber = busNumber;
    }

    // method
    // 승객 태운다
    public void take(int money) {
        this.money += money;
        count++;
    }

    // 상태창
    public void showInfo() {
        System.out.println(">>> BUS INFO <<<");
        System.out.println("Bus Number : " + busNumber);
        System.out.println("Passenger Count : " + count);
        System.out.println("Bus money : " + money);
    }


} // end of class
