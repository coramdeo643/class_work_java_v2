package ch04;

import java.util.Scanner;

public class WhileTest2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("종료하고싶은 정수값을 입력하시오 : ");

        // for 1 ~ 10 = 55
        int sum = 0;
        int a = 1;
        final int END = sc.nextInt();
        while (a < END) {
            sum += a;
            a++;
        } // end of while
        System.out.println("SUM = " + sum);

    } // end of main
} // end of class
