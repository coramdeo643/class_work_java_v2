package ch07;

// code side designing student class
public class Student {

    // 속성(상태)
    int studentId;
    String studentName;
    String address;
    int age;
    String sex;

    // 행위
    public void study() {
        System.out.println(studentName + " 이(가) 공부를 합니다.");
    }

    public void breakTime() {
        System.out.println(studentName + " 이(가) 휴식을 합니다.");
    }

    public void showInfo() {
        System.out.println("------------상태창------------");
        System.out.println("학생 ID : " + studentId);
        System.out.println("학생 이름 : " + studentName);
        System.out.println("학생 주소 : " + address);
    }

    // 메서드란?
    // 객체에 기능을 구현하기 위해 클래스 내부에 구현되는 함수
    // 메서드는 멤버 메서드라고 부르기도 함
    // !! 메서드는 함수와 다르게 [멤버 변수]**를 활용해서 기능을 구현한다

    // 함수와 메서드를 구분해서 부르자~
    // 연습 문제
    // 시험을 친다 method
    public void takeExam() {
        System.out.println(studentName + " 이(가) 시험을 칩니다.");
    }

    // 청소를 한다 method
    public void cleaning() {
        System.out.println(studentName + " 이(가) 청소를 합니다.");
    }

} // end of class
