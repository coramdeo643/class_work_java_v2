package generic.ch03;

public class MainTest3 {
    public static void main(String[] args) {

        // 재료선언
        Powder powder1 = new Powder();
        Plastic plastic1 = new Plastic();
        Water water1 = new Water();

        // 타입의 안정성과 <T extends Object> 타입에 제한을 둘수있다
        GenericPrinter<Powder> genericPrinter1 = new GenericPrinter<>();
        genericPrinter1.setMaterial(powder1);

        GenericPrinter<Plastic> genericPrinter2 = new GenericPrinter<>();
        genericPrinter2.setMaterial(plastic1);

        // water?
        // 컴파일 시점 오류 발생~
        /// GenericPrinter<Water> genericPrinter3 = new GenericPrinter<Water>();

    } // end of main
} // end of class
