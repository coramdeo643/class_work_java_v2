package variable;

public class Var3 {
    // entry point of the main
    public static void main(String[] args) {

        // 변수선언하고 값을 넣는 방법과 사용하는 방법을 확인함
        // int <-- 예약어 = 자바 개발자들이 미리 선정해둔 단어
        int a;

        // 변수 ageBox, 변수 telBox 선언
        int ageBox;
        int telBox;

        // ageBox 값 50 초기화 하기
        ageBox = 50;

        // 콘솔에 ageBox 값을 출력
        System.out.println(ageBox);

        // 변수는 변할수있는수, 값을 저장할수있는 메모리 공간

        // ageBox 라는 변수에 값을 100으로 변경
        ageBox = 100;
        // 값을 다시 출력 후 변경여부 확인
        System.out.println(ageBox);

        // 출력할 값이 없어서 오류 처리 = 변수 출력하려면 초기화 필요
        // System.out.println(telBox);


    } // end of main

} // end of class
