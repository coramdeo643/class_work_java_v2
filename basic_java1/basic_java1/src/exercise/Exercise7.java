package exercise;

public class Exercise7 {
    // entry
    public static void main(String[] args) {

        // for 1 ~ 100
        // i = 33 break
        for (int a = 1; a < 101; a++) {
            System.out.println(a);
            if (a == 33) {
                break;
            } // end of if
        } // end of for

        System.out.println("---------------------");
        // 1 ~ 10 odd skip even print
        for (int a = 1; a < 11; a++) {
            if (a % 2 != 0) {
                System.out.println(a + "는 홀수, 패스!");
                continue;
            } // end of if
            System.out.println("짝수 : " + a);
        } // end of for
        System.out.println("---------------------");

    } // end of main
} // end of class
