package com.array;

import java.util.Arrays;
import java.util.Random;

public class ArrayTest4 {
    public static void main(String[] args) {
        // 배열 사용 랜덤 숫자 6개 저장 후 출력
        // 배열은 보통 for 반복문과 함께 많이 사용됨

        // Random tool
        Random random = new Random();
        // 배열은 연관된 데이터 타입을 하나, 통으로 관리하기 위해 사용
        // int 6 배열 선언
        int[] intBoxes = new int[6];
        for (int i = 0; i < intBoxes.length; i++) {
            intBoxes[i] = random.nextInt(45) + 1;
            System.out.println(intBoxes[i] + "  ");
        }

        Arrays.sort(intBoxes);
        System.out.println("-==--=-=-=---=-");
        for (int i = 0; i < intBoxes.length; i++) {
            System.out.printf(intBoxes[i] + "\t");
        }


    }
}
