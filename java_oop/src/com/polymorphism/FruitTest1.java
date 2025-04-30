package com.polymorphism;

public class FruitTest1 {
    public static void main(String[] args) {
        // 다형성, 다양한 형태로
        Fruit fruit1 = new Banana(); // 업캐스팅
        Fruit fruit2 = new Peach(); // 업캐스팅

        fruit1.showInfo();
        System.out.println("----------------");
        fruit2.showInfo();

        // 사전기반지식, 컴파일&런타임시점
        // 위 상황에서 바나나의 원산지 정보 출력?
        // 업캐스팅 : 컴파일 시점에 부모에 있는 변수나 메서드만 확인가능
        String resultOrigin = ((Banana)fruit1).origin;
        System.out.println("origin : " + resultOrigin);

        // 키워드 - 인스턴스오브 연산자?
        // instanceof --> 예약어
        if (fruit1 instanceof Peach) {
            System.out.println("Here? 1");
        }

        if (fruit1 instanceof Banana) {
            System.out.println("Here? 2");
        }

        // fruit1 saleBanana() method 호출
        ((Banana) fruit1).saleBanana();
        fruit1.showInfo();




    } // end of main
} // end of class
