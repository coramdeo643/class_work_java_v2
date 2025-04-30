package ch10;

public class Student {

    String name;
    int money;

    // 매개변수 2개를 받는 생성자를 만들어보자
    public Student(String n, int m) {
        name = n;
        money = m;
    }

    // 학생의 상태창을 보여준다
    public void showInfo() {
        System.out.println("********* Student Status *********");
        System.out.println("Student name = " + name);
        System.out.println("Student money = " + money);
    }

    // 학생이 버스를 탄다
    public void takeBus(Bus bus) {
        // 버스에 천원을 내고,
        bus.take(1_000);
        // 내 멤버 변수 money 천원 빼기
        money -= 1_000;
    }
    // 학생이 지하철을 탄다
    public void takeSubway(Subway sub) {
        sub.take(1_000);
        money -= 1_000;
    }

} // end of class
