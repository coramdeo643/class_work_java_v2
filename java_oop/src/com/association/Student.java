package com.association;

public class Student {

    private String name;

    private Course course; // 넓은 의미의 연관관계

    public Student(String name){
        this.name = name;
        course = null; // 초기에는 수강 하지 않은 상태
    }

    // 수강을 듣다. (과목 정보는 course 에 있음)
//    public void takeCourse(Course course) {
//        course.getName();
//    }

    public void enroll(Course course) {
        this.course = course; // 이름 저장
        System.out.println(name + " 이(가) " + course.getName() + " 강의를 수강합니다");
    }

    // 학생의 현재 수강중인 상태를 보여주는 기능
    public void showCourse() {
        if (this.course != null) {
            System.out.println(name + " 이(가) " + this.course.getName() + " 강의를 수강중입니다");
        } else {
            System.out.println("There is no class enrolled");
        } // end of if
    }

    // 수강취소 기능을 만들어보세요
    public void end() {
        if (course == null) {
            System.out.println("이미 수강중인 상태가 아닙니다");
        } else {
            System.out.println(course.getName() + " 강의를 수강취소합니다");
            this.course = null;
        } // end of if
    }

} // end of class
