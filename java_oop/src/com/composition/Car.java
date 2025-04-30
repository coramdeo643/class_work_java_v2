package com.composition;

public class Car {

    String name;
    int price;
    // Composition
    // Car 클래스는 Engine 객체를 포함 합니다.
    Engine engine;
    
    public Car() {
        // 자동차 객체가 생성될땨, 엔진 객체도 함께 생성됨
        // 강한 의존성

        engine = new Engine();
    }

    void startCar() {
        engine.start(); // car 객체를 통해 Engine 의 start() 메서드를 호출합니다
        System.out.println("Car is starting!");
    }

    void stopCar() {
        System.out.println("Car is stopping!");
        engine.stop();
    }

    public static void main(String[] args) {
        // ** 컴포지션 관계를 **
        // 자동차 클래스 내부에서 엔진 객체를 생성시켜야 컴포지션 관계

        Car car = new Car();
        car.startCar();
        car.stopCar();

    }
    

} // end of class
