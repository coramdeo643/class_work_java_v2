package exception;

public class ThrowHandling {
    public static void main(String[] args) {

        boolean flag = true;
        if (flag) {
            // 필요에 의해서 직접 미리 만들어둔 예외 클래스를 생성할수있음~
            throw new ArithmeticException();
        }

    } // end of main
} // end of class
