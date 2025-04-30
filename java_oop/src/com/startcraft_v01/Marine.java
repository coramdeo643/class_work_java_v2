package com.startcraft_v01;

public class Marine {

    private String name;
    private int power;
    private int hp;

    // 생성자
    public Marine(String name) {
        this.name = name;
        this.power = 4;
        this.hp = 70;
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
    public void attackZealot(Zealot zealot) { // Marine is attacking Zealot
        if (this.hp <= 0) {
            System.out.println(name + " is dead already☠\uFE0F");
            return; // return and do not proceed to next line
        }
        System.out.println(name + " is attacking " + zealot.getName() + "\uD83D\uDCA5");
        zealot.beAttacked(this.power);
    }

    public void attackZergling(Zergling zergling) { // Marine is attacking Zergling
        if (this.hp <= 0) {
            System.out.println(name + " is dead already☠\uFE0F");
            return; // return and do not proceed to next line
        }
        System.out.println(name + " is attacking " + zergling.getName() + "\uD83D\uDCA5");
        zergling.beAttacked(this.power);
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
        System.out.println(" ⭐ Marine Name : " + name);
        System.out.println(" ⭐ Marine Power : " + power);
        System.out.println(" ⭐ Marine HP : " + hp);
    }

} // end of class
