package ch10;

public class GoingToSchool2 {
    // main entry
    public static void main(String[] args) {

        // Bus 3
        Bus bus1 = new Bus(99);
        Bus bus2 = new Bus(88);
        Bus bus3 = new Bus(77);
        // Student 2
        Student s1 = new Student("Kim", 10_000);
        Student s2 = new Student("Park", 30_000);
        // 학생이 버스를 타는 행위 생성
        s1.takeBus(bus1);
        s1.takeBus(bus1);
        s2.takeBus(bus2);
        s1.showInfo();
        s2.showInfo();
        // 버스 상태창 출력해서 결과 확인
        bus1.showInfo();
        bus2.showInfo();



    } // end of main
} // end of class
