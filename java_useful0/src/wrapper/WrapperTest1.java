package wrapper;

public class WrapperTest1 {
    public static void main(String[] args) {

        // Boxing
        // 기본 데이터를 래퍼 클래스 객체로 변환하는 과정
        int num = 10;
        Integer wrappedNum = Integer.valueOf(num); // --> This is Boxing
        System.out.println(wrappedNum);

        // Unboxing
        // 래퍼 클래스 객체를 기본 타입 데이터로 변환하는 과정
        Integer wrappedNum2 = Integer.valueOf(30); // This is Unboxing
        int num2 = wrappedNum2.intValue();
        System.out.println(num2);

        // Auto-boxing & Auto-unboxing
        // 편의성을 제공 - Java 5 부터 도입된 기능
        Integer autoBoxed = 20; // Auto-Boxing (int(value) --> Integer)
        int autoUnboxed = autoBoxed; // Auto-unboxing (Integer(value) --> int)
        System.out.println(autoUnboxed);

        double num11 = 10;
        Double num12 = Double.valueOf(num11);
        System.out.println(num12);

    } // end of main
} // end of class
