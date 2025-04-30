package com._this;

/**
 * code side designing class
 */
public class Person {

    // 3 usage of this
    // 1. 자기 자신의 주소를 가리킨다
    // 2. 생성자에서 다른 생성자를 호출할때 사용
    // 3. 자신의 주소를 반환 시킬수있다

    private String name;
    private int age;
    private String phone;
    private String gender;

    // #1 사용방법(문법+사용이유)
    public Person(String name, int age) {
        // 멤버변수 = 매개변수 넣고 싶어
        this.name = name; // this.member variable = parameter
        this.age = age;
        System.out.println("1번 생성자 호출 완료");
    }
    // #2 사용방법 this();
    // this 는 생성자에서 다른 생성자를 호출가능
    public Person(String name, int age, String phone) {
        // System.out.println("1111");
        // this.name = name;
        // this.age = age;
        this(name, age);
        this.phone = phone;
        System.out.println("2번 생성자 호출 완료");
    }

    public Person(String name, int age, String phone, String gender) {
        this(name, age, phone);
        this.gender = gender;
        System.out.println("3번 생성자 호출 완료");
    }

    // 3. 현재 생성된 객체, 즉, 나의 주소를 외부로 반환 가능
    // --> 디자인 패턴 ( 프로그램 작성할때 일관된 문제가 발생가능 )
    // 특정 코드의 패턴을 만들어서 해결해 나가는 방법적인 코드 패턴

    public Person getPerson() {
        return this;
    }


} // end of class
