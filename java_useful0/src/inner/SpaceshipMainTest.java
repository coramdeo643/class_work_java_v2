package inner;

public class SpaceshipMainTest {
    public static void main(String[] args) {

        // member inner class 주의점 = 외부 클래스가 먼저 생성되어야 접근 가능

        // static inner class usage!
        Spaceship s1 = new Spaceship();
        s1.startSpaceShip();

        Spaceship.Engine engineNum1 = new Spaceship.Engine();
        Spaceship.Engine engineNum2 = new Spaceship.Engine();
        Spaceship.Engine engineNum3 = new Spaceship.Engine();

        s1.addEngine(engineNum1);
        s1.startSpaceShip();

        // Why do we use?
        // [for logical grouping]
        // static inner class is...
        // 외부 클래스와 논리적으로 관련있는 클래스들을 그룹화 하는데 유용하다,
        // 이는 코드의 가독성과 구조화 개선이며,
        // 관련 클래스들을 함께 유지할수있게 도움을 준다!


    } // end of main
} // end of class
