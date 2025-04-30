package ch01;

// 탭 간격을 일정하게 유지하면 코드가 더 읽기 쉬워집니다.(가독성 권장 사항)
public class HelloJava {

    // Single line comment : 자바가 실행하지 않는 부분입니다.
    /*
    Multi line comment : 긴 설명을 작성할 때 사용합니다.
     */

    // 코드의 진입점
    public static void main(String[] args) {
        // System.out.println(); = 콘솔에 괄호안의 내용을 출력하는 statement
        // semi-colon (;) = end of the sentence
        System.out.println("Hello, World!");
        System.out.println("안녕 코드 수정 했어");

        // shift + F10 = run
        // ctrl + alt + L = code alignment
        // ctrl + D = line copy
        // sout + enter = auto 'System.out.println();'
        // psvm + enter = auto 'public static void main(String[] args) {]'
        // main + enter = auto 'public static void main(String[] args) {]'

    } // end of main

} // end of class