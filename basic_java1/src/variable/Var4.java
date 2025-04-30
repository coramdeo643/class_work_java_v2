package variable;

public class Var4 {
    // entry point of code
    public static void main(String[] args) {

        // Variable
        // Declaration, initiation, and print of the variable
        // 변수 선언 --> 이름 짓기 Naming

        // Rules about the variable
        // Rule 1
        // 대소문자를 명확히 구분하면 길이에 제한이 없음
        int age = 10;
        int Age = 20;
        int aGe = 30;
        // 참고 -> 같은 파일에 같은 이름 변수 선언 불가

        // Rule 2
        // Keywords already taken by Java are not available
        // example; int, double, char, if, for, while...

        // Rule 3
        // Naming the variable starting with numbers are not available
        int tel30box; // Using numbers in the middle or the end are available

        // Rule 4
        // _(under bar) and $(dollar) are only available
        int _count_$;
        int $tel$;

        // 권장사항_표기법
        // xxx.java 파일을 만들때,
        // 대문자로 시작, 그다음은 소문자,
        // 그리고 연결 단어 시작은 다시 대문자
        // HelloJava.java = 파스칼 케이스

        // int telBox 변수 선언 표기법
        // 단어 시작은 소문자로, 연결단어 시작은 대문자
        // 카멜 케이스 _-_-_

    } // end of main
} // end of class
