package com.startcraft_v02;

import java.util.Scanner;

public class GameTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Zealot zealot2 = new Zealot("zealot2");
        Zergling zergling2 = new Zergling("zergling2");
        Marine marine2 = new Marine("marine2");

        while (true) {
            System.out.print("[ 1. Zealot 2. Marine 3. Zergling 0. Done ] : ");
            int selected = sc.nextInt();
            if (selected == 1) {
                System.out.print("Zealot is going to attack, ");
                System.out.print("[ 1. Marine 2. Zergling 3. Back ] : ");
                int target = sc.nextInt();
                if (target == 1) {
                    zealot2.attack(marine2);
                } else if (target == 2) {
                    zealot2.attack(zergling2);
                } else if (target == 3) {
                    break;
                } else {
                    System.out.println("Wrong number");
                }
            } else if (selected == 2) {
                System.out.print("Marine is going to attack, ");
                System.out.print("[ 1. Zealot 2. Zergling 3. Back ] : ");
                int target = sc.nextInt();
                if (target == 1) {
                    marine2.attack(zealot2);
                } else if (target == 2) {
                    marine2.attack(zergling2);
                } else if (target == 3) {
                    break;
                } else {
                    System.out.println("Wrong number");
                }
            } else if (selected == 3) {
                System.out.print("Zealot is going to attack, ");
                System.out.print("[ 1. Marine 2. Zealot 3. Back ] : ");
                int target = sc.nextInt();
                if (target == 1) {
                    zergling2.attack(marine2);
                } else if (target == 2) {
                    zergling2.attack(zealot2);
                } else if (target == 3) {
                    break;
                } else {
                    System.out.println("Wrong number");
                }
            } else if (selected == 0) {
                break;
            } else {
                System.out.println("Wrong number");
            } // end of if
        } // end of while


    } // end of main
} // end of class
