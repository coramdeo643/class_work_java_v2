package com.inheritance;

public class Warrior extends Hero {

    Warrior(String name, int hp) {
        // 부모 사용자 정의 생성자가 있다면
        // super() 키워드 사용해서
        // 부모 먼저 생성해줘야함
        super(name, hp);
    }

    // 부모의 메서드를 재정의 한다면,
    // method override


    @Override
    void attack() {
        System.out.println("Warrior is attacking!");
        super.attack();
    }

    void comboAttack() {
        System.out.print(name + "'s skill activated! ");
        System.out.println("Combo Attack!");
    }
}
