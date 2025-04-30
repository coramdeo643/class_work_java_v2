package ch04;

public class ForMainTest3 {
    // entry
    public static void main(String[] args) {

        // 1 ~ 50 정수값 출력, 만약 짝수이면 출력
        // 반복문에 if 구문 활용, 실행 흐름 제어 가능
        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            } // end of if
        } // end of for

        // 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10
        int sum = 0;
        for (int a = 1; a < 11; a++) {
            sum += a;
        } // end of for

        System.out.println("sum = " + sum);

    } // end of main
} // end of class
