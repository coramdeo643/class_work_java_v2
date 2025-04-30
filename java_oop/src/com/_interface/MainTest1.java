package com._interface;

public class MainTest1 {
    public static void main(String[] args) {

        // Interface can design flexible code!!
        RemoteController[] remoteControllers = new RemoteController[3];
        remoteControllers[0] = new Television();
        remoteControllers[1] = new Refrigerator();
        remoteControllers[2] = new ToyRobot();

        // Interface is the standard or 강제성이 있는 Rule
        for (int i = 0; i < remoteControllers.length; i++) {
            if (remoteControllers[i] != null) {
                remoteControllers[i].turnOn();
            } // end of if
        } // end of for


    } // end of main
} // end of class
