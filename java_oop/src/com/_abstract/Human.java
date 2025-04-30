package com._abstract;

public abstract class Human extends Animal {

    @Override
    public void move() {
        System.out.println("사람이 두발로 걷습니다");
    }
}
