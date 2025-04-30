package ch03;

import java.util.Scanner;

public class IfTest5 {
    // entry
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 범위안 숫자가 잘못 입력되면 잘못된 입력이라고 출력
        int score;
        do {
            System.out.print("성적 입력(0~100) : ");
            score = sc.nextInt();
            char grade = 'x';

            if (score >= 90 && score <= 100) {
                grade = 'A';
            } else if (score >= 80 && score < 90) {
                grade = 'B';
            } else if (score >= 70 && score < 80) {
                grade = 'C';
            } else if (score >= 60 && score < 80) {
                grade = 'D';
            } else if (score >= 0 && score < 60) {
                grade = 'F';
            } else if (score < 0 || score > 100) {
                System.out.println("잘못된 입력입니다, 다시 입력하세요.");
            }
            if (score < 0 || score > 100) {
                System.out.print("");
            } else {
                System.out.println("당신의 학점은 " + grade + " 입니다.");
            }
        } while (score < 0 || score > 100);


    } // end of main
} // end of class

