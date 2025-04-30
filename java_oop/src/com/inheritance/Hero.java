package com.inheritance;

public class Hero {

    String name;
    int hp;

    public Hero(String name, int hp) {
     this.name = name;
     this.hp = hp;
    }

    void attack() {
        System.out.println(name + ", Attack!");
    }

    public static void main(String[] args) {
        Warrior warrior = new Warrior("Barbarian", 100);
        Archer archer = new Archer("Amazon", 100);
        Wizard wizard = new Wizard("Sorceress", 100);
        warrior.attack();
        warrior.comboAttack();
    }

} // end of class
