package ch04;

public class BreakTest1 {
    // entry
    public static void main(String[] args) {

        // 10 times loop
        int i;
        for (i = 1; i < 11; i++) {
            // 만약 i값이 7의 소수라면 반복문 stop
            System.out.println("i = " + i);
            if (i % 7 == 0) {
                break;
            } // end of if
        } // end of for
        System.out.println("i 확인 = " + i);


    } // end of main
} // end of class
