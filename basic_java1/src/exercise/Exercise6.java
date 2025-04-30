package exercise;

import java.util.Scanner;

public class Exercise6 {
    // entry
    public static void main(String[] args) {

        // 스캐너 도구 사용
        // 뺄셈/곱셈/나눗셈/나머지... 연산 프로그램 만들어보기
        Scanner sc = new Scanner(System.in);
        System.out.print("1. 정수를 입력해주세요 : ");
        int a = sc.nextInt();
        System.out.print("2. 정수를 입력해주세요 : ");
        int b = sc.nextInt();
        int bigger = (a > b) ? a : b;
        int add = a + b;
        int sub = a - b;
        int multi = a * b;
        int div = a / b;
        int mod = a % b ;
        System.out.println("Bigger number is = " + bigger);
        System.out.println("addition = " + add);
        System.out.println("sub = " + sub);
        System.out.println("multiply = " + multi);
        System.out.println("div = " + div);
        System.out.println("mod = " + mod);


    } // end of main
} // end of class

