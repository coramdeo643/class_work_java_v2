package exception;

public class ExceptionTest1 {
    public static void main(String[] args) {

        // 사용자 정의 예외 클래스 사용해보기
        int result = 0;

        Calc2 calc2 = new Calc2();
        try {
            calc2.divide(10, 0);
        } catch (DivideByZeroException e) {
            throw new RuntimeException(e);
        }

    } // end of main
} // end of class

class Calc2 {

    public int divide(int n1, int n2) throws DivideByZeroException {
        int result = 0;
        try {
            result = n1 / n2;
        } catch (Exception e) {
            // 우리가 만든 사용자 정의 예외클래스 사용
            throw new DivideByZeroException("0으로 나누지 마쇼");
        }
        return result;
    }
}