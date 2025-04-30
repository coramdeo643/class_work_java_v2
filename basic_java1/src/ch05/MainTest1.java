package ch05;

public class MainTest1 {

    // entry(main)
    public static void main(String[] args) {

        // JVM 가상 메모리 공간이 존재한다
        // 1. JVM Stack 메모리 공간 있다
        // 2. Heap 동적 메모리 공간 있다

        // Heap 동적 메모리 공간에 있다
        // 동적으로 커졌다 작아졌다
        Book bookBox1 = new Book();
        // Stack 메모리 공간에 존재한다
        int n1 = 10;


    } // end of main

} // end of class
