package com.access;

public class HeroTest {
    public static void main(String[] args) {

        Hero h1 = new Hero();
        Hero h2 = new Hero();
        h1.setName("Superman");
        h1.setHp(100);
        h1.setPower(10);
        h1.setDefense(10);

        h2.setName("Batman");
        System.out.println(h1.getName());
        System.out.println(h2.getName());


    } // end of main
} // end of class
