package my_test;

import java.util.Scanner;

public class MyTest1 {
    public static void main(String[] args) {


        // 이전 배웠던 내용 + 복한 대입연산자 활용해서 직접 문제 만들고 결과 확인
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 개월 근무 하셨나요? : ");
        int month = sc.nextInt();

        // 시급 10030원
        int pay = 10030;
        // 알바 주 6일 일 5시간
        // System.out.println("일급 : " + pay * 5);
        // System.out.println("주급 : " + pay * 6 * 5);
        // System.out.println("월급 : " + pay * 4 * 6 * 5);
        // 근무개월수
        pay *= (month * 4 * 6 * 5);
        System.out.print(month + "개월 급여 : " + pay);
        pay /= 10000;
        System.out.println(" (= 약 " + pay + " 만원)");


    } // end of main
} // end of class
