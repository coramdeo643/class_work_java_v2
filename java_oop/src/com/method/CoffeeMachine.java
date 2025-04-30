package com.method;

/**
 * Method Practice
 * Method? 객체에 소속된 함수,
 * 클래스의 상태(데이터)를 활용하거나
 * 객체와 관련된 작업을 처리할 때 사용
 */
public class CoffeeMachine {

    // property setting
    // Coffee machine status : amount of water and coffee bean
    int water; // amount of water(ml)
    int coffee; // amount of coffee bean(g)

    // behaviour setting
    // method 1 : fill water
    public void refillWater (int amount) {
        // 방어적 코드
        if (amount > 0) {
            water += amount;
            System.out.println(amount + " ml 의 물을 채웠어요");
        } else {
            System.out.println("0 ml 보다 큰 양의 물을 채워주세요");
        } // end of if
    }

    // method 2 : refill coffee bean
    public void refillCoffee (int amount) {
        if (amount > 0) {
            coffee += amount;
            System.out.println(amount + " g 의 커피원두를 채웠어요");
        } else {
            System.out.println("0 g 보다 많은 양의 커피원두를 채워주세요");
        } // end of if
    }

    // method 3 : brew coffee
    public String brewCoffee () {
        // 1 cup of coffee = 100 ml water + 10 g coffee bean
        // defensive code!
        if (water >= 100 && coffee >= 10) {
            water -= 100; // 100 ml water
            coffee -= 10; // 10 g coffee bean
            return "Here is a cup of coffee for you!";
        } else {
            return "Aww... we need to refill water or coffee bean more! wait a moment please~";
        } // end of if
    }

    // practice
    // 사용자 정의 생성자를 멤버 변수 water, coffee 값이 초기화 될수있도록 코드 추가
    //
    public CoffeeMachine(int w, int c) {
        water = w;
        coffee = c;
    }

    public void showInfo () {
        System.out.println(" = = = COFFEE MACHINE STATUS = = = ");
        System.out.println("Current amount of water = " + water + " ml");
        System.out.println("Current amount of coffee bean = " + coffee + " g");
    }

} // end of class
