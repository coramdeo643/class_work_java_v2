package generic.ch02;

public class MainTest2 {

    public static void main(String[] args) {

        // 재료선언
        Plastic plastic1 = new Plastic();
        Powder powder1 = new Powder();

        // 사용하는 시점에 T 대신 어떤 자료형을 사용할지 지정해주면 됨
        GenericPrinter<Plastic> genericPrinter1 = new GenericPrinter<>();
        genericPrinter1.setMaterial(plastic1);
        System.out.println(genericPrinter1.toString());
        // 재료꺼내기
        Plastic usePlastic = genericPrinter1.getMaterial(); // 형변환 필요없음
        /// Powder usePowder = genericPrinter1.getMaterial();
        // 컴파일 시점에 오류 알려줘서 안정적인 코드 작업을 수행가능

        Water water1 = new Water();
        GenericPrinter<Water> genericPrinter2 = new GenericPrinter<>();
        genericPrinter2.setMaterial(water1);
        System.out.println(genericPrinter2.toString());

    }
}
