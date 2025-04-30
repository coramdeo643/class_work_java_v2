package ch10;

public class GoingToSchool {
    // main entry
    public static void main(String[] args) {

        Bus bus1 = new Bus(1313);
        Bus bus2 = new Bus(1004);
        Subway sub1 = new Subway(3);

        Student s1 = new Student("Elon", 10_000);
        Student s2 = new Student("Teemo", 5_000);

        // s1.showInfo();
        s1.takeBus(bus1);
        s2.takeBus(bus1);
        // bus1 = 실제 값은 주소값이다
        //----------------------------------
        s1.showInfo();
        s2.showInfo();
        bus1.showInfo();
        // 사전 기반 지식
        // 기본 데이터 & 참조 타입
        // 기본(소문자) : int a = 10; 값이 담긴다
        // 참조(대문자) : Student s1(주소값이 담긴다)


    } // end of main

} // end of class
