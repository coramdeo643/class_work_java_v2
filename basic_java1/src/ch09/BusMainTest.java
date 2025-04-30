package ch09;

public class BusMainTest {
    // main entry
    public static void main(String[] args) {

        // 생성자를 사용하는 목적은,
        // 강제성을 부여하기 위함이다.
        Bus b1 = new Bus(133, "Local", "GOLD");
        b1.showInfo();


    } // end of main
} // end of class
