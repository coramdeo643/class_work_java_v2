package com.array;

import java.util.Random;

// 250417.1600.
public class ArrayTest5 {
    public static void main(String[] args) {

        // 1. 문자열 배열 선언 및 초기화
        String[] fruits = {"Apple", "Banana", "Orange", "Mango", "Grape"};
        System.out.println(fruits.length);

        // 랜덤 숫자 뽑아서 해당 번호 과일 출력
        // 오늘 뭐 먹지? 같은 느낌
        Random random = new Random();
        int choice = random.nextInt(5); // 0, 1, 2, 3, 4
        System.out.println("오늘의 과일은? : " + fruits[choice]);

        //--------------------------------------

    }
}
