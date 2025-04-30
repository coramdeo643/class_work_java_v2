package com.inheritance;

public class Cal {

    public int sum(int n1, int n2) {
        return n1 + n2;
    }

    public int multiple(int n1, int n2) {
        return n1 * n2;
    }

} // end of class

// xxx.java 하나의 자바파일에 여러개의 클래스를 선언가능
// 단 스코프는 분명히 구분되어짐
// !중요! 단 하나의 자바파일에 public 클래스는 오직 하나만 존재가능

// 부모, 자식 클래스 관계 형성
class ChildCal extends Cal{

    // 마이너스 기능 추가 요청
    // 곱하기 기능에서 n1 과 n2에 0이 들어온다면 0을 입력하지 마시오 문구 출력 수정 요청
    public int sub(int n1, int n2) {
        return n1 - n2;
    }

    // 상속을 사용했을때 메서드 오버라이드 개념 !!!,
    // 부모 클래스의 메서드를 재정의 가능 = method override!
    // 문법 = 부모 클래스의 메서드 이름과 매개변수 및 타입, 즉 모양이 동일해야함

    public int multiple(int n1, int n2) {
        if(n1 == 0 || n2 == 0){
            System.out.println("0을 입력하지 마시오");
        }
        return n1 * n2;
    }

} // end of class
