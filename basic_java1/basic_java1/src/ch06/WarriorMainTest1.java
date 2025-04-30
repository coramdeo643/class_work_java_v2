package ch06;

public class WarriorMainTest1 {
    // entry
    public static void main(String[] args) {

        // 메인 지역에서 선언한,
        // 지역 변수

        // instantiation
        Warrior w1 = new Warrior(); // 객체 생성
        w1.name = "Amadeus";
        w1.hp = 100;
        w1.power = 30;
        w1.dp = 10;
        w1.color = "red";
        // w1 주소값을 화면에 객체에 정보를 출력하자
        System.out.println(w1.color);
        System.out.println(w1.name);

        System.out.println("----------");
        Warrior w2 = new Warrior(); // 객체
        System.out.println(w2.hp); // 기본값 0
        System.out.println(w2.weight); // 기본값 0.0
        System.out.println(w2.isDie); // 기본값 false
        System.out.println(w2.name); // 기본값 null
        // null(널) = 값이 없다
        Warrior w3 = new Warrior(); // 객체 생성



    } // end of main

} // end of class
