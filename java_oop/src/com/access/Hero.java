package com.access;

public class Hero {

    private String name;
    private int hp;
    private int power;
    private double defense;
    private boolean isDie;

    // getter 5
    public String getName() {
        return name;
    }
    public int getHp() {
        return hp;
    }
    public int getPower() {
        return power;
    }
    public double getDefense() {
        return defense;
    }
    public boolean getIsDie() {
        return isDie;
    }
    // setter 5
    public void setName(String n) {
        name = n;
    }
    public void setHp(int h) {
        hp = h;
    }
    public void setPower(int p) {
        power = p;
    }
    public void setDefense(double d) {
        defense = d;
    }
    public void setIsDie(boolean is) {
        isDie = is;
    }

} // end of class
