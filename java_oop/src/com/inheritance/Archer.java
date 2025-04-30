package com.inheritance;

public class Archer extends Hero {

    Archer(String name, int hp) {
        super(name, hp);
    }

    void fireArrow() {
        System.out.print(name + "'s skill activated! ");
        System.out.println("Fire Arrow!");
    }
}
