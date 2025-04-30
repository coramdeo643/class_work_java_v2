package com.inheritance;

// super 추상화가 핵심 개념!
// 부모 클래스 Super
class Animal {
    // 자식 클래스에서 접근 가능하다
    protected String name;

    void eat() {
        System.out.println(name + "이(가) 밥을 먹습니다.");
    }

    void bark() {
        System.out.println(name + "이(가) 짖습니다.");
    }
}

// 자식 클래스 Sub
class Dog extends Animal {

    @Override
        // annotation = 주석 + 힌트
    void eat() {
        // super.eat(); 필요하다면 사용
        // 강아지의 먹는 모습을 구현..
    }
}

class Cat extends Animal {

    @Override
    void eat() {
        // 고양이 먹는 모습 구현
        // super.eat();
    }
}

// xxx.java 단 하나의 자바파일에는 public 가진 클래스는 오직 하나만 존재가능
public class Main1 {
    // main entry
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "바둑이";
        dog.eat(); // superclass method
        dog.bark(); // subclass method

    } // end of main
} // end of class
