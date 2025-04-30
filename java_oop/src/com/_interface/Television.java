package com._interface;

//
public class Television extends HomeAppliances implements RemoteController{

    @Override
    public void turnOn() {
        System.out.println("TV Turn On");
    }

    @Override
    public void turnOff() {
        System.out.println("TV Turn Off");
    }
}
