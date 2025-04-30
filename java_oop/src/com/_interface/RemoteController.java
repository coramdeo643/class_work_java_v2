package com._interface;

public interface RemoteController {

    // Interface?
    // 구현된 것이 아무것도 없는 밑 그림만 있는 기본설계도

    // 모든 변수는, 상수가 된다. public static final int N; All the variables,
    // 모든 메서드는, 추상 메서드가 된다, 심지어 abstract 키워드도 생략가능. All the methods,

    // 추상클래스보다 추상화가 더 높다.
    // 중요!!! 인터페이스 = 사용할 때 무언가 "동작 중심"의 클래스를 선언해야할때 사용!

    // 인터페이스는 표준! 또는 강제성이 있는 규약! Standard or Rule!

    // 오직 static final
    public static final int SERIAL_NUMBER = 100;

    public abstract void turnOn();
    public abstract void turnOff();

}
