package com.polymorphism;

/**
 * 하나의 데이터 타입을 다양한 형태로 바라보는것 = polymorphism
 * 한 요소 : 메서드, 클래스... 여러형태를 가질수있는 능력
 * 상속관계, 다형성 살펴보는중~
 */
public class AnimalTest1 {

    public static void main(String[] args) {

        Animal animal1 = new Animal();
        animal1.move();
        animal1.eating();
        System.out.println("---------------");

        // 다형성의 장점,
        // 부모 타입으로 자식 클래스를 인스턴스화 가능.
        Animal animal2 = new Tiger();
        animal2.move();
        animal2.eating();

        // 코드를 작성하는 시점 = 컴파일
        // 프로그램 실행 = 런타임
        System.out.println("---------------");
        Animal animal3 = new Human();
        animal3.move();
        animal3.eating();





    } // end of main
} // end of class
