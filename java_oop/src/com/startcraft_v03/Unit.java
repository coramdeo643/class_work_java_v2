package com.startcraft_v03;

public class Unit {

    protected String name;
    protected int power;
    protected int hp;

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public int getHp() {
        return hp;
    }

    public void showInfo() {
        System.out.println(" ⭐ ⭐ ⭐ 상태창 ⭐ ⭐ ⭐ ");
        System.out.println("Name : " + name);
        System.out.println("Power : " + power);
        System.out.println("HP : " + hp);
    }

    public void attack(Unit unit) {
        if (this.hp <= 0) {
            return; // return and do not proceed to next line
        }
        unit.beAttacked(this.power);
    }

    public void beAttacked(int power) {
        // Defensive code
        if (this.hp <= 0) {
            return; // return and do not proceed to next line
        }
        if (this.hp <= power) {
            this.hp -= power;
            return; // return and do not proceed to next line
        } else {
            this.hp -= power;
        }
    }

} // end of class
