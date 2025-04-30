package exercise;

import java.util.Scanner;

public class Exercise9 {
    // main entry
    public static void main(String[] args) {

        // 호출 연습
        greet("John");
        int square1 = square(11);
        System.out.println("square1 = " + square1);
        
        String result1 = signOfNumber(-1);
        System.out.println("result1 = " + result1);
        
        boolean isAdult = checkAdult(20);
        System.out.println("isAdult = " + isAdult);
        
        int max = findMax(100, 1001);
        System.out.println("max = " + max);
        
    } // end of main
//-----------------------------------------------------------------
    static void greet(String name) {
        System.out.println("안녕하세요, [" + name + "]님!");
    } // end of greet

    static int square (int a) {
        return a * a;
    } // end of square
    
    static String signOfNumber (int a) {
        if (a == 0) {
            return "zero";
        } else if (a > 0) {
            return "positive";
        } else {
            return "negative";
        } // end of if
    } // end of signOfNumber

    static boolean checkAdult (int a) {
        boolean result = (a >= 18);
        return result;
    } // end of checkAdult

    static int findMax (int a, int b) {
        int max = (a > b) ? a : b;
        return max;
    } // end of findMax

} // end of class
