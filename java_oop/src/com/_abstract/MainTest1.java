package com._abstract;

public class MainTest1 {

    public static void main(String[] args) {

        // 객체 지향 개념으로, animal 클래스를 인스턴스화 시키면 좀 이상함
        Animal animal; // 타입 선언 가능
        //  animal = new Animal(); 오류 발생!
        // Animal 클래스는 abstract 키워드 붙여서 추상클래스로 설계함,
        // 그러면 추상클래스는 new 라는 키워드 생성자를 활용해서,
        // 독립적으로 메모리에 올릴수없다.

        // Human human = new Human();
        // 개발자가 객체를 생성시킬때
        // 다른 사용자가 마음대로 객체를 생성시키지 못하게
        // 강제성을 지닐수있음









    } // end of main
}
