package com.composition;

public class Computer {

    String brand;
    int price;
    CPU cpu;

    public Computer() {
        cpu = new CPU();
    }

    void computerON() {
        System.out.println("Computer is on");
        cpu.on();
    }

    void computerOFF() {
        System.out.println("Computer is off");
        cpu.off();
    }

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.computerON();
        computer.computerOFF();
    }




}
