package ch04;

import java.util.Scanner;

public class WhileTest3 {
    // entry
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean flag = true;
        while (flag) {
            System.out.print("숫자를 입력해주세요 : ");
            int a = sc.nextInt();
            if (a == 0) {
                System.out.println("프로그램 종료합니다.");
                break;
            }
            System.out.print("...");
        } // end of while


    } // end of main
} // end of class
