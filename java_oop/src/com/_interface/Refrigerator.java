package com._interface;

public class Refrigerator extends HomeAppliances
        implements RemoteController, SoundEffect {

    @Override
    public void turnOn() {
        System.out.println("Ref. Turn On");
    }

    @Override
    public void turnOff() {
        System.out.println("Ref. Turn Off");
    }

    @Override
    public void soundOn() {
        System.out.println("'Ring' the door is opened");
    }

    @Override
    public void soundOff() {

    }
}
