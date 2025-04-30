package com.composition;

import java.util.Random;

public class Food {

    Random random = new Random();
    private String name;
    private int number;

    public Food(String name) {
        this.name = name;
        number = random.nextInt(5) +1;
    }

    void foodName() {
        System.out.println(name + " : " + number + " pcs");
    }

}
