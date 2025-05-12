package wrapper;

import java.util.ArrayList;

public class WrapperTest5 {
    public static void main(String[] args) {
        // 컬렉션 프레임워크에서의 사용
        // 컬렉션은 객체만 저장가능, 즉 래퍼 클래스를 사용해 처리해야함
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(Integer.valueOf(10));
        numbers.add(20); // auto-boxing
        numbers.add(30); // auto-boxing
        int sum = numbers.get(0) + numbers.get(1) + numbers.get(2); // auto-unboxing
        System.out.println("sum = " + sum);

        // List  사용하여 가격 정보 저장 (Double 래퍼 클래스 활용)
        ArrayList<Double> prices = new ArrayList<>();
        prices.add(Double.valueOf(12.5));
        prices.add(15.75); // auto-boxing
        prices.add(10.0);  // auto-boxing

        String s1 = 5235 + "";
        int s2 = 152324;
        String strValue = String.valueOf(s2);
        System.out.println(strValue);



    } // end of main
}
