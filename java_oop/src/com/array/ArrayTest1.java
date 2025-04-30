package com.array;

public class ArrayTest1 {
    // main
    public static void main(String[] args) {

        // Array?
        // 연관된 데이터 타입을 한번에 모아서 통으로 관리하기 위해 사용

        // Grammar
        // Rule 1.
        // 배열은 반드시 먼저 몇개의 데이터가 들어갈수 크기를 지정해야한다

        // int[] numbers; // declare array
        // numbers = new int[4]; // 4바이트 네모칸 3개 초기화

        int[] numbers = new int[3]; // DT 뒤에 대괄호 ok
        // int intBoxes[] = news int[5]; // 변수뒤에 대괄호 문법 허용

        // [][][] 값아직
        int[] grades = new int[]{1, 2, 3};
        // [1],[2],[3]
        // int grades2 = {1, 2, 3, 4, 5, 6};
        // [1],[2],[3],[4],[5],[6]

        // 문제
        // 5개의 크기를 가지는 double DT 선언
        // 배열 이름 맘대로
        double[] doubles = new double[5];
        doubles[0] = 1;
        doubles[1] = 1.1;
        doubles[2] = 1.2;
        doubles[3] = 1.3;
        doubles[4] = 1.4;
        // !!! 중요 = 모든 프로그래밍 언어의 인덱스 번호는 0부터 시작함 !!!
        // doubles 배열의 길이는? 5개
        // doubles 인덱스의 길이는? 인덱스의 길이 4
        // !! 모든 인덱스의 길이 = n -1
        // doubles[5] = 1.5; = error

        int[] array1 = new int[57]; // 배열 길이 57 인덱스 길이 56
        int[] array2 = new int[157]; // 배열 길이 157 인덱스 길이 156
        
        // string array declaration
        String[] stringBox = new String[3];
        stringBox[0] = "Apple";
        stringBox[1] = "Banana";
        stringBox[2] = "Carrot";

        System.out.println("->->->->->->->->->->");
        System.out.println(stringBox.length); // 3
        System.out.println(stringBox[0]); // A
        System.out.println(stringBox[1]); // B
        System.out.println(stringBox[2]); // C

        for (int i = 0; i < stringBox.length; i++) {
            System.out.println(stringBox[i]);
        }
        

    } // end of main
} // end of class
