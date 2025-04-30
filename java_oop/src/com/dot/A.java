package com.dot;

public class A {

    B b;

    // 생성자 ( 인스턴스화 될 때 제일 먼저 수행하는 코드이다)
    public A() {
        System.out.println("A 생성자 호출");
        b = new B();
    }

}
