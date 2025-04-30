package com.array;

import java.util.Random;

public class ArrayTest3 {

    public static void main(String[] args) {

        // random number
        Random random = new Random();
        // 배열과 for 문 활용 코드 수정
        int[] ranInt = new int[6];

        for (int i = 0; i < ranInt.length; i++) {
            ranInt[i] = random.nextInt(45) + 1;
            System.out.println(ranInt[i]);
        }

//        int ranInt1 = random.nextInt(45) + 1;
//        int ranInt2 = random.nextInt(45) + 1;
//        int ranInt3 = random.nextInt(45) + 1;
//        int ranInt4 = random.nextInt(45) + 1;
//        int ranInt5 = random.nextInt(45) + 1;
//        int ranInt6 = random.nextInt(45) + 1;


    } // end of main

} // end of class
