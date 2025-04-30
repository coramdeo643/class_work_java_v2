package com._this;

public class PersonMainTest {
    // main entry
    public static void main(String[] args) {

        //Person p1 = new Person("Tim", 10, "010-4576-7098");
        Person p1 = new Person("Tim", 10, "010-4576-7098", "F");

        // 결과 --> return this --> 주소값 반환 com._this.Person@2f4d3709
        System.out.println(p1.getPerson());

    } // end of main
} // end of class
