package com.startcraft_v01;

public class Zergling {

    private String name;
    private int power;
    private int hp;

    // 생성자
    public Zergling(String name) {
        this.name = name;
        this.power = 3;
        this.hp = 50;
    }

    // getter = read only
    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public int getHp() {
        return hp;
    }

    // setter : no need
    // method
    public void attackZealot(Zealot zealot) { // Zergling is attacking Zealot
        if (this.hp <= 0) {
            System.out.println(name + " is dead already☠\uFE0F");
            return; // return and do not proceed to next line
        }
        System.out.println(name + " is attacking " + zealot.getName() + "\uD83D\uDCA5");
        zealot.beAttacked(this.power);
    }

    public void attackMarine(Marine marine) { // Zergling is attacking Marine
        if (this.hp <= 0) {
            System.out.println(name + " is dead already☠\uFE0F");
            return; // return and do not proceed to next line
        }
        System.out.println(name + " is attacking " + marine.getName() + "\uD83D\uDCA5");
        marine.beAttacked(this.power);
    }

    public void beAttacked(int power) {
        // Defensive code
        if (this.hp <= 0) {
            System.out.println(name + " is dead already☠\uFE0F");
            return; // return and do not proceed to next line
        }
        if (this.hp <= power) {
            this.hp -= power;
            System.out.print(name + " is attacked\uD83D\uDE22");
            System.out.println(" and dead☠\uFE0F");
            return; // return and do not proceed to next line
        } else {
            this.hp -= power;
            System.out.println(name + " is attacked\uD83D\uDE22");
        }
    }

    public void showInfo() {
        System.out.println(" ⭐ ⭐ ⭐ 상태창 ⭐ ⭐ ⭐ ");
        System.out.println(" ⭐ Zergling Name : " + name);
        System.out.println(" ⭐ Zergling Power : " + power);
        System.out.println(" ⭐ Zergling HP : " + hp);
    }


}
