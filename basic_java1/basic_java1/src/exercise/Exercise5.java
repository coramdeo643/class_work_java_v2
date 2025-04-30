package exercise;

// import = 수입 or 가져오기
import java.util.Scanner;

public class Exercise5 {
    // entry
    public static void main(String[] args) {

        // 자바 특징 = 풍부한 라이브러리(기능들) 제공
        // 자바 표준 라이브러리 - 스캐너
        // 키보드에서 값을 가져올수있다
        Scanner sc = new Scanner(System.in);
        System.out.printf("1. 정수값을 입력하시오 : ");
        // 명령어 --> 사용자가 입력한 키보드 값을 받기 위한 명령어,
        // 그 중에 정수값을 받기 위한 명령어
        int x = sc.nextInt();
        System.out.println();
        System.out.printf("2. 정수값을 입력하시오 : ");
        int y = sc.nextInt();
        System.out.println();

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        // 사용가 입력한 두값을 받아서 덧셈 연산을 시켜보자
        System.out.println("result = " + (x + y));


    } // end of main
} // end of class

