package com.startcraft_v04;

public class GameTest1 {

    public static void main(String[] args) {

        // 실행의 흐름을 스스로 만들어 보자
        // 배열, 객체, for... 다형성 확인

        Zealot[] zealots = new Zealot[10];
        zealots[0] = new Zealot("Zeal1");

        Zergling[] zerglings = new Zergling[10];
        zerglings[0] = new Zergling("Zerg1");

        Marine[] marines = new Marine[10];
        marines[0] = new Marine("Mar1");

        Unit[] units = new Unit[100];
        units[0] = zealots[0];
        units[1] = zealots[0];
        units[2] = zealots[0];
        units[3] = zealots[0];
        units[4] = zealots[0];
        units[5] = zerglings[0];

        for (int i = 0; i < units.length; i++) {
            if (units[i] != null) {
                if (units[i] instanceof Zealot) {
                    ((Zealot)units[i]).attack(zerglings[0]);
                    ((Zealot)units[i]).attack(marines[0]);
                } else if (units[i] instanceof Zergling) {
                    units[i].showInfo();
                }
            }
        }

    } // end of main
} // end of class
