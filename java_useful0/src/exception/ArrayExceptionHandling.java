package exception;

public class ArrayExceptionHandling {

    public static void main(String[] args) {

        // Array 5 index 0~4
        int[] arr = {1, 2, 3, 4, 5};

        // 예외처리 try-catch 구문의 이해
        // 예외처리 try-catch-finally 구문의 이해

        try {
            // 예외가 발생할 가능성이 있는 코드를 넣어준다.
            for (int i = 0; i < 10; i++) {
                System.out.println("arr[" + i + "] = " + arr[i]);
            } // end of for

        } catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println("배열의 범위를 넘었어요");

        } catch (Exception e2) {
            System.out.println(e2.getClass());
            // 예외가 발생했다면, 예외처리를 만들어줄수있음
            //System.out.println("나의 예외처리 : " + e.getMessage());
        }
        System.out.println("비정상, 종료되지않았습니다!");
    } // end of main
}
