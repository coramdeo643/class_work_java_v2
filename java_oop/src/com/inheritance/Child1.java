package com.inheritance;

public class Child1 extends Super1{
    int age;

    // 상속에서 부모가 존재해야 자식이 존재할수있다
    public Child1(String name, int age) {
        super(name);
        this.age = age;
    }
}
