package com._static;

public class Company {

    // static variable is also called class variable
    static int empSerialNumber = 1;

    // me
    public static void main(String[] args) {


        Employee employee1 = new Employee("Teemo");
        Employee employee2 = new Employee("Shaco");
        Employee employee3 = new Employee("Yasuo");
        Employee employee4 = new Employee("Zinx");

        System.out.println("Teemo : " + employee1.getEmployeeId());
        System.out.println("Shaco : " + employee2.getEmployeeId());
        System.out.println("Yasuo : " + employee3.getEmployeeId());
        System.out.println("Zinx : " + employee4.getEmployeeId());

    } // eom
} // eoc
