package com._static;

public class NumberPrinter {

    /**
     * Static variable and method are accessible with class name without 객체생성
     * bc heap 메모리에 들어가기 위해서는 new 키워드와 생성자를 호출한뒤 동작가능하지만,
     * method area 영역은 프로그램을 실행시키면 바로 메모리를 할당 받아 실행되는 영역이기때문
     */

    private int id;
    // member variable(in class NumberPrinter)
    // public int waitNumber; // we cannot use the shared waiting number
    public static int waitNumber;

    public NumberPrinter(int id) {
        this.id = id;
        waitNumber = 1;
    }

    // method, print the queue
    public void printWaitNumber() {
        System.out.println(" waiting number of " + id + " is " + waitNumber);
        waitNumber++;
    }


} // end of class
