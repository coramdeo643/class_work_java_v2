package ch03;

import java.util.Scanner;

public class IfTest4 {
    // entry
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("성적 입력 : ");
        int score = sc.nextInt();
        System.out.println("score = " + score);


            if (score >= 90 && score <= 100) {
                System.out.println("A 학점입니다");
            } else if (score >= 80 && score < 90) {
                System.out.println("B 학점입니다");
            } else if (score >= 70 && score < 80) {
                System.out.println("C 학점입니다");
            } else if (score >= 60 && score < 80) {
                System.out.println("D 학점입니다");
            } else if (score >= 50 && score < 60) {
                System.out.println("F 학점입니다");
            } else {
            }


    } // end of main
} // end of class

