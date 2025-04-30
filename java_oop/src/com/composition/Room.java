package com.composition;

public class Room {

    private String type;

    public Room(String type){
        this.type = type;
    }


    void describe() {
        System.out.println("This is " + type);
    }

} // end of class
