package com.startcraft_v01;

import java.util.Scanner;

public class GameTest {
    // main entry
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Zealot zealotl1 = new Zealot("Zealot Joe");
        Zergling zergling1 = new Zergling("Zergling King");
        Marine marine1 = new Marine("Marine George");

        while (true) {
            System.out.println("1. Zealot 2. Marine 3. Zergling 0. Done");
            System.out.print("Choose your choice : ");
            int selected = sc.nextInt();
            if (selected == 1) {
                System.out.println("You chose Zealot");
                System.out.println("1. Marine 2. Zergling 3. Back");
                System.out.print("Choose one to attack : ");
                int target = sc.nextInt();
                if (target == 1) {
                    zealotl1.attackMarine(marine1);
                } else if (target == 2) {
                    zealotl1.attackZergling(zergling1);
                } else if (target == 3) {
                    break;
                } else {
                    System.out.println("Wrong number");
                }
            } else if (selected == 2) {
                System.out.println("You chose Marine");
                System.out.println("1. Zealot 2. Zergling 3. Back");
                System.out.print("Choose one to attack : ");
                int target = sc.nextInt();
                if (target == 1) {
                    marine1.attackZealot(zealotl1);
                } else if (target == 2) {
                    marine1.attackZergling(zergling1);
                } else if (target == 3) {
                    break;
                } else {
                    System.out.println("Wrong number");
                }
            } else if (selected == 3) {
                System.out.println("You chose Zergling");
                while (true) {
                    System.out.println("1. Zealot 2. Marine 3. Back");
                    System.out.print("Choose one to attack : ");
                    int target = sc.nextInt();
                    if (target == 1) {
                        zergling1.attackZealot(zealotl1);
                    } else if (target == 2) {
                        zergling1.attackMarine(marine1);
                    } else if (target == 3) {
                        break;
                    } else {
                        System.out.println("Wrong number");
                    }
                }

            } else if (selected == 0) {
                System.out.println("Game closed");
                break;
            } else {
                System.out.println("Wrong number");
            }
        }


    } // end of main
} // end of class
