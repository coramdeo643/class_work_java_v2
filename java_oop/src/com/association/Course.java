package com.association;

public class Course {

    private String name;

    public Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println("강의 : " + name);
    }


} // end of class
