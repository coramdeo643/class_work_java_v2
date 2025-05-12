package wrapper;

public class WrapperTest4 {
    public static void main(String[] args) {
        // 기본타입(int, double, boolean) --> 문자열로 변환하는 방법?
        // 1. 가장 쉬운 방법
        System.out.println(10 + "");
        String str1 = 15.5 + "";

        // 2. String 클래스의 valueOf() 활용하는 방법
        int value = 5000;
        String strValue = String.valueOf(value); // value(int) --> String
        System.out.println("int into String = $ " + strValue);
        
        Float value2 = 500.123F; // 접미사 
        // 정수값 기본 연산단위 int, 실수값 기본 연산단위 double
        Long value3 = 1000L;
        
        String strValue2 = String.valueOf(value2);
        System.out.println("strValue2 = " + strValue2); // 500.123
        String strValue3 = String.valueOf(value3);
        System.out.println("strValue3 = " + strValue3); // 1000

    } // end of main
} // end of class
