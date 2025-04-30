package ch03;

/**
 * 빠른평가?
 * 논리 연산에서 첫번째 조건이 결과를 결정할경우
 * 두번째 조건을 평가 하지 않는것
 */
public class Operation8 {
    // main entry
    public static void main(String[] args) {

        int number = 5;
        int index = 0;
        // 논리합 || 에서 빠른 평가?
        // 첫번째에서 true 라면 다음은 skip
        //                            105 > 10  ||             100 < 10
        //                                T     ||                 F
        boolean result = ((number += 100) > 10) || ((index += 100) < 10);
        System.out.println("result = " + result); // T
        System.out.println("number = " + number);
        System.out.println("index = " + index);


    } // end of main
} // end of class