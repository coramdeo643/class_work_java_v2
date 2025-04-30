package ch05;

// 2. 코드를 실행하는 측
public class StudentProgram {

    // entry
    public static void main(String[] args) {

        // Student 클래스를 메모리에 올려보자
        // s1 이라는 클래스를 인스턴스화 했다.
        // 인스턴스화 = 메모리에 올리는 행위
        Student s1 = new Student();
        int a = 10;
        System.out.println("s1 = " + s1);
        System.out.println("a = " + a);

        // 변수의 가장 큰 2가지 종류
        // 1. Primitive DT(상자에 데이터값이 담긴다, Value
        // 2. Reference DT(주소가 담긴다), Address

    } // end of main

} // end of class
