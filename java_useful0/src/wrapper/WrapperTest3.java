package wrapper;

public class WrapperTest3 {
    public static void main(String[] args) {
        /// ** 래퍼 클래스의 활용 ** 
        // String --> 기본 데이터 타입(int, double, boolean)
        String strNum = "123";
        String strDouble = "45.678";
        String strBool = "true";
        String badStr = "a123";
        // wrapper class 활용해서 형변환처리
        int num = Integer.parseInt(strNum);
        System.out.println("num = " + num);
        //
        double dNum = Double.parseDouble(strDouble);
        System.out.println("dNum = " + dNum);
        //
        boolean boolNum = Boolean.parseBoolean(strBool);
        System.out.println("boolNum = " + boolNum);
        // 예외처리
        try {
            int intNum = Integer.parseInt(badStr);
        } catch (NumberFormatException e) {
            System.out.println(badStr + " 을 정수값으로 변경 불가");
        }
        // 가능한 String --> 기본 데이터 타입으로 변환할때
        // 예외처리 코드를 작성해주는것이 좋다

        String sInt = "123123";
        int n = Integer.parseInt(sInt);
        System.out.println("n = " + n);

        String sDouble = "123.123";
        double d = Double.parseDouble(sDouble);
        System.out.println("d = " + d);

        String sBool = "false";
        boolean b = Boolean.parseBoolean(sBool);
        System.out.println("b = " + b);



    } // end of main
}
