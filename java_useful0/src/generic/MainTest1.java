package generic;

public class MainTest1 {
    public static void main(String[] args) {

        Plastic plastic1 = new Plastic();
        Powder powder1 = new Powder();

        ThreeDPrinter1 threeDPrinter1 = new ThreeDPrinter1();
        // 재료를 주입해주어야한다
        threeDPrinter1.setMaterial(new Plastic());

        // 위 코드의 한계, 플라스틱에서 파우더로 재료변경시,
        // 재료가 플라스틱에 종속되어 있기 때문에 ThreeDPrinter2 처럼
        // 새로운 클래스를 생성하거나 코드를 수정해야하는 번거로움이 발생!.

        ThreeDPrinter2 threeDPrinter2 = new ThreeDPrinter2();
        threeDPrinter2.setMaterial(new Powder());

        // 데이터 타입이 다르지만,
        // 변수명을 동일하게 사용해야한다면,
        // 제네릭 프로그래밍 활용 가능!

        System.out.println("- - - - - - - - - - - - - - ");

        ThreeDPrinter3 threeDPrinter3 = new ThreeDPrinter3();
        threeDPrinter3.setMaterial(plastic1);
        // 재료 꺼내기
        threeDPrinter3.getMaterial();
        Plastic usePlastic = (Plastic) threeDPrinter3.getMaterial();
        System.out.println(usePlastic.toString());
        // 재료 교체
        threeDPrinter3.setMaterial(powder1);
        Powder usePowder = (Powder) threeDPrinter3.getMaterial();
        System.out.println(usePowder.toString());
        // Object 타입으로 설계하면 모든 데이터 타입 담을수있지만
        // 매번 원시코드 확인해서 다운캐스팅 하는 등 불편함 있음


    } // end of main
} // end of class
