package com.array;

/**
 * 20250418.0900.
 * Array? 연관된 데이터 타입에 요소들을 통으로 관리하기 위해 사용
 */
public class IntArrayCRUD {

    public static void main(String[] args) {
        // C.R.U.D.
        // 1. CREATE
        // 배열은 반드시 크기(길이 지정 필수)
        // 인덱스 번호를 통해서 각 요소를 찾아감
        // 모든 인덱스에 번호는 0부터 시작
        int[] intArray = new int[5];
        // 배열은 보통 반복문과 함께 많이 사용
        // intArray.length --> 현재 배열에 길이를 리턴
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (i + 1) * 10; // 10, 20, 30, 40, 50
        }

        // 2. READ
        System.out.println("- - - - - -");
        // System.out.println(intArray[0]);
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        // 3. UPDATE
        System.out.println("- - - - - -");
        intArray[2] = 3;
        System.out.println("intArray[2] updated as : " + intArray[2]);
        
        // 4. DELETE
        // 배열은 고정 길이이므로 
        // 특정 인덱스(int)를 
        // 0 으로 초기화 하여 논리적으로 삭제
        System.out.println("- - - - - -");
        intArray[2] = 0;
        System.out.println("intArray[2] deleted as : " + intArray[2]);
        
        System.out.println("Program closed!");
    } // end of main

} // end of class
