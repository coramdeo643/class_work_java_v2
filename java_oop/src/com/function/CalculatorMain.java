package com.function;

/**
 * Function? 데이터를 받아서 처리하고 결과를 돌려주는 코드 블록
 * static = 객체 없이 바로 호출 가능
 */
public class CalculatorMain {
    // main entry
    public static void main(String[] args) {
        // numbers for test
        int num1 = 10;
        int num2 = 0;
        int testNumber = 7;

        // 더하기 함수 호출
        int sum = add(num1, num2);
        System.out.println(num1 + " + " + num2 + " = " + sum);

        int sum1 = subtract(num1, num2);
        System.out.println(num1 + " - " + num2 + " = " + sum1);

        int sum2 = multiply(num1, num2);
        System.out.println(num1 + " * " + num2 + " = " + sum2);

        double sum3 = divide(num1, num2);
        System.out.println(num1 + " / " + num2 + " = " + sum3);

        boolean result1 = isEven(testNumber);
        System.out.println(testNumber + " is even number = " + result1);

        boolean result2 = isOdd(testNumber);
        System.out.println(testNumber + " is odd number = " + result2);

    } // end of main

    // two integers add function
    static int add(int a, int b) { // 선언부
        return a + b; // 입력받은 a와 b를 add and return
    }

    // two integers subtract Func.
    static int subtract(int a, int b) { // 선언부
        return a - b; // 입력받은 a와 b를 subtract and return
    }

    // two integers multiply Func.
    static int multiply(int a, int b) { // 선언부
        return a * b; // 입력받은 a와 b를 multiply and return
    }

    // two integers divide Func.
    static double divide(int a, int b) { // 선언부
        // 방어적 코드를 잘 작성해야한다!
        if (b == 0 || a == 0) {
            System.out.println("0으로 나눌 수 없습니다.");
            return 0;
        }
        return (double) a / b; // 입력받은 a와 b를 divide and return
    }

    // 짝수인지 판별하는 함수 - 매개변수 1개
    static boolean isEven(int num) {
        return num % 2 == 0; // 나머지가 0이면 짝수 = true
    }

    // 홀수인지 판별 - 매개변수 1
    static boolean isOdd(int num) {
        return num % 2 != 0; // 나머지가 0이면 홀수
    }


} // end of class
