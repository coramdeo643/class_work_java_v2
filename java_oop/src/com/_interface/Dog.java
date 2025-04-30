package com._interface;

// 인터페이스는 '상속'대신 '구현받다, 구현하다' 라고 표현
// Animal interface had implemented
// public class Dog implements Animal --> abstract class 만들거나 Override
public class Dog implements Animal {

    // 추상메서드를 구현메서드로 재정의해야
    @Override
    public void eat() {
        System.out.println("강아지가 먹이를 먹습니다");
    }

    @Override
    public void move() {
        System.out.println("강아지가 달린다");
    }

    public static void main(String[] args) {

        // 다형성 적용, polymorphism applied
        Animal dog = new Dog(); // upcasting
        Animal bird = new Bird(); // upcasting

        dog.eat();
        dog.move();

        bird.eat();
        bird.move();

    } // end of main

}

class Bird implements Animal {

    @Override
    public void eat() {
        System.out.println("새가 모이를 먹습니다");
    }

    @Override
    public void move() {
        System.out.println("새가 하늘을 난다");
    }
}