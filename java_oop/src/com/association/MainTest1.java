package com.association;

public class MainTest1 {

    public static void main(String[] args) {

        Course java = new Course("JAVA");
        Course db = new Course("DataBase");

        Student student = new Student("Hong Gil");
        student.enroll(java);
        student.showCourse();





    } // end of main
} // end of class
