package ch01;

// 모든 자바 파일에 코드는 클래스라는 안에서 작성한다.
public class HelloJava2 {

    // 코드의 진입점 main 함수
    public static void main(String[] args) {

        // ...println() 은 출력 후에 자동으로 콘솔에서 줄바꿈
        System.out.println("hello java1");
        System.out.println("hello java2");
        System.out.println("hello java3");
        System.out.println("hello java4");

        System.out.println("---------------------");
        // printf 는 포맷팅된 출력을 위해 사용되며, 자동으로 줄바꿈하지않습니다.
        // printf 에서 줄바꿈을 원한다면 \n 을 추가해야합니다

        System.out.printf("text1");
        System.out.printf("/");
        System.out.printf("text2\n"); // \n  = new line
        System.out.printf("안녕\n");

        //  escape sequence 이스케이프 시퀀스 \n 으로 줄바꿈 추가
        // \(백슬래시)는 시퀀스 라고 부르는 특수문자 중 하나
        // 백슬래시 뒤에 나오는 문자가 특별한 의미를 가지게 됨

        System.out.printf("Hello\tWorld"); // \t = tab


    } // end of main

} // end of class