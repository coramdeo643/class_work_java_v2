package com.inheritance;

/**
 * 상속 기법을 아는 개발자,
 * A 클래스 속성과 상태를 물려받을수있음
 */

/**
 * 자바에서는 단일 상속만을 지원함
 * 관계가 형성됨
 * A=부모, B=자식
 */
public class C extends A {
    // C extends A
    // 여기 코드에는 안보이지만, 자동으로 A에 선언된 필드를 물려받음

    int level;
    String nickName;


} // end of class

