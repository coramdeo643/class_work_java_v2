package com.overloading;

/**
 * Method Overloading?
 * 같은 이름의 method 를 여러개 정의하는 것
 */
public class Calculator {

    // Addition method
    public int add(int a, int b) {
        return a + b;
    }

    // 매개변수의 DT가 다르면 compiler 는 구분할수있어
    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public String add(String str1, String str2) {
        return str1 + str2;
    }

    // code entry
    public static void main(String[] args) {

        // already method overloading...
        System.out.println();
        System.out.println();
        System.out.println();

    } // end of main
} // end of class
