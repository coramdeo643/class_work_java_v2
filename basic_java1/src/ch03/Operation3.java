package ch03;

/**
 * 비교 연산자
 * 연산의 결과값을 true, false로 반환
 */
public class Operation3 {
    // main entry
    public static void main(String[] args) {

        int n1 = 10;
        int n2 = 5;
        boolean result = (n1 < n2); // 10 < 5 = false
        System.out.println(result); // f
        System.out.println(n1 > n2); // t
        System.out.println(n1 >= n2); // t
        System.out.println(n1 <= n2); // f
        System.out.println(100 <= 100); // t
        System.out.println(100 == 100); // t
        System.out.println(n1 == n2); // f
        System.out.println(n1 != n2); // t
        System.out.println(5 != 1); // t
        System.out.println(20 != 20); // f
        // 연산자 자체를 주어로 바라보자!


    } // end of main
} // end of class