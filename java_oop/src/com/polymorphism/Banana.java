package com.polymorphism;

public class Banana extends Fruit {

    String origin; // 원산지 담는 공간 선언

    public Banana() {
        name = "Dole banana";
        price =  3000;
        origin = "Philippines";
    }

    public void saleBanana() {
        System.out.println("지금은 할인 행사중~");
        System.out.println("이 방송이 나간후 바나나 천원할인해요~");
        price -= 1000;
    }
}
