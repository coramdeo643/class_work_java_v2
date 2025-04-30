package com.startcraft_v02;

/**
 * Method Overloading
 */
public class Zealot {

    private String name;
    private int power;
    private int hp;

    public Zealot(String name) {
        this.name=name;
        this.power=50;
        this.hp=80;
    }
    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getPower() {
        return power;
    }

    public void attack(Zergling zergling) {
        if (this.hp <=0 ) {
            return;
        }
    }

    public void attack(Marine marine) {
        if (this.hp <=0 ) {
            return;
        }
    }

    public void beAttacked(int power) {
        if (this.hp<=0){
            return;
        }
        if (this.hp <=power) {
            this.hp -= power;
            return;
        } else {
            this.hp -= power;

        }
    }

    public void showInfo() {
        System.out.println("@ STATUS @");
        System.out.println("name = " + name);
        System.out.println("power = " + power);
        System.out.println("hp = " + hp);
    }

} // end of class
