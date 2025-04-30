package com._interface;

// 장난감 로봇이 가전을 상속받게 되면 의미가 맞지 않음
// (Turn On Off 는 그대로 사용할수있지만...)
// 추상 클래스보다 more flexible 설계 기법이 인터페이스!
public class ToyRobot implements RemoteController, SoundEffect {

    String name;

    @Override
    public void turnOn() {
        System.out.println("Toy robot Turn on");
    }

    @Override
    public void turnOff() {
        System.out.println("Toy robot Turn off");
    }

    @Override
    public void soundOn() {
        System.out.println("'Tu Ru Tu Ru Ru'");
    }

    @Override
    public void soundOff() {

    }
}
