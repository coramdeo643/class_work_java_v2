package ch06;

public class MainTest1 {
    // main entry
    public static void main(String[] args) {
        // 사용자 정의 데이터 타입 --> 클래스
        // 클래스 인스턴스화(메모리에 올린다)
        // 메모리 영역 2가지,
        // Stack and Heap
        int n1;
        int n2 = 10;
        User user1 = new User(); // heap 에 박스 생성
        User user2 = new User(); // heap 에 박스 생성
        user2.age = 100; // heap 에 접근해서 age 데이터 초기화


    } // end of main
} // end of class
