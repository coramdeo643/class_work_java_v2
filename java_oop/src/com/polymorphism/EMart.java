package com.polymorphism;

public class EMart {

    public static void main(String[] args) {

        Banana banana1 = new Banana();
        Banana banana2 = new Banana();


        // 배열
        // 배열 사용시 반드시 크기 먼저 지정
        // 배열의 길이와 요소의 길이(크기)는 항상 동일하지는 않아
        Banana[] bananas = new Banana[10];
        bananas[0] = banana1;
        bananas[1] = banana2;

        Peach[] peaches = new Peach[3];
        peaches[0] = new Peach();
        peaches[1] = new Peach();

        System.out.println("-=-=-=-=-=-=-");
        // 다형성, 유연한 코드 작성 가능
        Fruit[] fruits = new Fruit[5];
        fruits[0] = new Banana();
        fruits[1] = new Peach();
        fruits[2] = new Banana();
        fruits[3] = new Peach();


        System.out.println("-=-=-=-=-=-=-");

        // 도전 문제
        for (int i = 0; i < fruits.length; i++) {
            // 배열안에 들어있는 각각의 객체 showInfo() 전부 호출
            // 만약, 데이터 타입이 바나나일경우 원산지 정보와 sale 메서드도 출력
            if (fruits[i] != null) {
                fruits[i].showInfo();
                if (fruits[i] instanceof Banana) {
                    // down-casting
                    String o = ((Banana)fruits[i]).origin;
                    System.out.println("origin : " + o);
                    ((Banana) fruits[i]).saleBanana();
                }
            }
        }










    } // end of main
} // end of class
