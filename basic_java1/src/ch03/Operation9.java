package ch03;

public class Operation9 {
    // main entry
    public static void main(String[] args) {

        // 삼항연산자
        int number = 7; // 테스트 할 숫자
        // 1. 삼항연산자로 홀/짝수 판단
        // String = 문자열 DT --> "안녕 반가워"
        String result = (number % 2 == 0) ? "even" : "odd";
        System.out.println("result = " + result);

        boolean isOK = (5 > 3) ? true : false;
        System.out.println("isOK = " + isOK);

        // 두수 중 큰수를 max 변수에 담고 출력
        int max = (10 > 1) ? 10 : 1;
        System.out.println("max = " + max);

    } // end of main
} // end of class