package ch03;

/**
 * 빠른평가?
 * 논리 연산에서 첫번째 조건이 결과를 결정할경우
 * 두번째 조건을 평가 하지 않는것
 */
public class Operation7 {
    // main entry
    public static void main(String[] args) {

        int number = 5;
        int index = 0;
        // 논리곱 && 에서 빠른 평가 동작 확인
        //                             15 < 10                 2 < 10
        //                                F     &&               T
        boolean result = (((number += 10) < 10) && ((index += 2) < 10));
        System.out.println("result = " + result);
        System.out.println("number = " + number);
        System.out.println("index = " + index);
        // 대입연산자 사용시, 변수 접근해서 값을 변경


    } // end of main
} // end of class