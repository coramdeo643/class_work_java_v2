package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyHandling {
    public static void main(String[] args) {

        // try-catch-finally
        Scanner scanner = new Scanner(System.in);


        try {
            System.out.print("숫자를 입력해줘 : ");
            int result = scanner.nextInt();
            System.out.println("입력한 숫자 : " + result);
//            return;
        } catch (InputMismatchException e1) {
            System.out.println("Wrong input, 숫자를 입력해주세요");
        } catch (Exception e2) {
            System.out.println(e2.getClass()); //class java.util.InputMismatchException
            System.out.println("입력 오류 !!!");

        } finally {
            // 반드시 수행되어야 하는 코드 입력
            // 심지어 return 키워드를 만나도 여기는 수행됨
            scanner.close(); // 스트림을 자원을 해제합니다.
            System.out.println("자원 해제했습니다");
        }

        System.out.println("프로그램이 비정상 종료 안됨!");
    } // end of main
}
