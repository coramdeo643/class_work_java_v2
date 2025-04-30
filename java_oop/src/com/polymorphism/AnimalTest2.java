package com.polymorphism;

public class AnimalTest2 {

    public static void main(String[] args) {

        // 하나의 메서드가 메서드 여러 형태를 가질수있는 능력을 의미
        // move() -->
        // 하나열 변수에 롱으로 데이터를 관리하고 싶다면, 배열

        Animal[] animals = new Animal[3];
        animals[0] = new Animal();
        animals[1] = new Tiger();
        animals[2] = new Human();

        for (int i = 0; i < animals.length; i++) {
             animals[i].move();
        }






    }

}
