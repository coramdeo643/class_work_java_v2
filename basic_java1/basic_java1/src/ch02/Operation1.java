package ch02;

/**
 * 부호 연산자(+/-)
 * 단항 연산자
 */
public class Operation1 {
    // entry
    public static void main(String[] args) {
        // Changed only at the printed time
        int intData = 1000;
        System.out.println(+intData);
        System.out.println(-intData);
        System.out.println("-----------------");
        System.out.println(intData);

        // 실제 값을 변경하려면?
        // intData 안에 값을 -1000으로 변경하려면?
        // 실제 값 변경하려면 대입연산자 사용해야함
        intData = -intData;
        System.out.println(intData);

        // 절대값?
        // 절대값은 어떤 수의 크기를 나타내는 것,
        // 그 수가 0에서 얼마나 떨어져있는지?
        // 즉 어떤수의 절대값은 그 수가 양수든 음수든 상관없이 항수 양수로 표기

        int oneStepDistance = 1;
        final int ZERO_POINT = 0;
        int currentPosition = 0;
        // 제로 포인트에서 왼쪽으로 3칸 이동한 값을 출력하시오
        currentPosition = ZERO_POINT - (oneStepDistance * 3);
        System.out.println(currentPosition);
        // 절대값으로 구하시오 --> 양수
        // 자바는 풍부한 기능을 제공하는 언어
        // 자바 개발자들이 수학관련 식을 거의 다 만들어둠
        // Math.abs() 절대값 구해주는 기능
        System.out.println(Math.abs(currentPosition));



    } // end of main
} // end of class
