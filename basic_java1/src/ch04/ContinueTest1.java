package ch04;

public class ContinueTest1 {
    // entry
    public static void main(String[] args) {

        // 반복문 내부 조건과 함께 사용
        // 조건이 맞는 경우 이후 반복문 블럭 내부의 다른 수행문들을 수행하지않는다
        // 무시하고 진행하는 continue
        // = skip

        // 1 ~ 100 까지 숫자 중 3의 배수만을 출력
        int num;
        for (num = 1; num <= 100; num++) {
            if (num % 3 != 0) {
                continue;
            } // end of if
            System.out.println("num : " + num);
        } // end of for


    } // end of main
} // end of class
