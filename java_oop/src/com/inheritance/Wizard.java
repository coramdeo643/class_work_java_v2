package com.inheritance;

public class Wizard extends Hero {

    Wizard(String name, int hp) {
        super(name, hp);
    }

    void freezing() {
        System.out.print(name + "'s skill activated! ");
        System.out.println("Freeze!");
    }

}
