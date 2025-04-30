package com.method;

public class CoffeeMachineMain {
    // main entry
    public static void main(String[] args) {

        // coffee machine object create = instantiation = instance / object
        CoffeeMachine machine1 = new CoffeeMachine(5, 5);

        // 재료채우기 동작 시켜보자 (water & coffee bean)
        machine1.refillWater(200); // argument 인수를 넣는다
        machine1.refillCoffee(30);
        machine1.showInfo();
        System.out.println("---------------------------------");

        // 커피 만들기 테스트
        System.out.println("커피 주문!");
        String result = machine1.brewCoffee();
        System.out.println(result);
        // one more coffee
        System.out.println("또 커피 주문!");
        System.out.println(machine1.brewCoffee());
        // one more coffee (
        System.out.println("또 커피 주문!");
        System.out.println(machine1.brewCoffee());

    } // end of main
} // end of class
