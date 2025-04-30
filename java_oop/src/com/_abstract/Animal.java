package com._abstract;

/**
 * Abstract class?
 * 하나 이상의 abstract method 포함하는 class
 * or class 키워드 앞에 abstract 가지고 있음
 */
// 강제적으로 타입으로만 설계하는 기법
// abstract = 강제성

public abstract class Animal {

    String name;

    public void move() {
        System.out.println("이동해요");
    }

    // 추상 메서드 만들어보자
    // 클래스 내에서 단 하나라도 추상 메서드를 가지고있다면,
    // 그 클래스는 반드시 추상 클래스가 되어야한다
    public abstract void hunt();


}
