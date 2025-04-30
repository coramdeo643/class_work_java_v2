package ch03;

/**
 * 논리 연산자 && || !
 * 비교 연산자 < <= >= > == !=
 * true or false
 */
public class Operation5 {
    // main entry
    public static void main(String[] args) {

        int n1 = 100;
        int n2 = 200;

        // 논리곱 &&
        //                       T && T
        boolean result1 = (n1 > 0) && (n2 > 0);
        System.out.println("result1 = " + result1);
        //                       T && F
        boolean result2 = (n1 > 0) && (n2 < 0);
        System.out.println("result2 = " + result2);
        // 논리합 ||
        //                       T || F
        boolean result3 = (n1 > 0) || (n2 < 0);
        System.out.println("result3 = " + result3);
        //                       F || F
        boolean result4 = (n1 < 0) || (n2 < 0);
        System.out.println("result4 = " + result4);
        // 부정 !
        System.out.println("부정연산확인 = " + !result4);
        System.out.println("logging result4 = " + result4);


    } // end of main
} // end of class