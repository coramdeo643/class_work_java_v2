package com._interface;

// how? interface 선언
// 여기 안에 선언된 메서드는 모두 추상 메서드가 되어야함
// why?

public interface Animal {

    // 메서드 선언부만 있고 바디가 없음
    public abstract void eat();
    // 생략 가능, 자동으로 abstract keyword applied,
    void move();

} // end of interface
