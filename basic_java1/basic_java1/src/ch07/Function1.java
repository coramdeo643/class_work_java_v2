package ch07;

public class Function1 {

    // Let's build a function (code designing the function)
    // 함수 만들기 위해서는 당연히 머리속에 어떻게 코드를 만들지 들어가있어야함
    // 두개의 정수값을 받아서 덧셈 연산을 하고 그결과를 반환하는 함수를 만들거야

    // static + int(return/output DT) + function name (input DT + name) {}
    // 괄호(n1, n2) = 매개변수(parameter)
    // {...} function body
    static int add(int n1, int n2) {
        // int result = n1 + n2;
        // 클래스 바로 아래 쓰는 변수를 멤버변수라고함
        // 함수안에 선언하는 변수를 지역변수(Local variable)라고함
        int result; // 지역변수를 선언했음
        result = n1 + n2;
        return result;
    }

    // 기능 묶음(세개의 정수값을 받아서 덧셈연산하는 함수)
    static int add2(int n1, int n2, int n3) {
        int result; // 지역변수 선언, 반드시 초기화 필요!
        result = n1 + n2 + n3;
        return result;
    }

    static double add3(double d1, double d2) {
        double result = d1 + d2; // 지역변수선언 + 초기화!
        return result; // 반환값 체크!
    }

    // 함수 --> 콘솔창에 안녕 내 나이는 00이야 출력하는 함수 만들어보자
    // void --> 텅 빈
    static void sayHello(int myAge) {
        System.out.println("안녕 내 나이는 " + myAge + "이야");
        // 리턴 타입 void = 반환값이 없다, 그래서 return 키워드 불필요
    }


} // end of class
