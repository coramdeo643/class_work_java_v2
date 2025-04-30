package com.inheritance;

public class MainTest1 {
    public static void main(String[] args) {

        // Cal 클래스와 ChildCal 관계는 부모-자식 관계
        ChildCal childCal1 = new ChildCal();
        int sum1 = childCal1.sum(10, 10);
        System.out.println("sum1 = " + sum1);

        int minus1 = childCal1.sub(100, 10);
        System.out.println("minus1 = " + minus1);

        // 부모 클래스의 메서드를 자식 클래스에서 재정의를 한다면,
        // method override
        int multi1= childCal1.multiple(10, 10);
        System.out.println("multi1 = " + multi1);

        // 상속관게에 있어서 부모클랫가 먼저 존재해야 자식클래스가 존재가능

    } // end of main
} // end of class
