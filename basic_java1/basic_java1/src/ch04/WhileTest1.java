package ch04;

public class WhileTest1 {
    public static void main(String[] args) {
        int a = 1;
        // 조건식
        while (a < 4) {

            System.out.println(a);
            a++;
            // 무한 루프 조심
        } // end of while
        System.out.println(a);

    } // end of main
} // end of class
