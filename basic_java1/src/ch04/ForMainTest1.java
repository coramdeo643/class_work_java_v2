package ch04;

public class ForMainTest1 {
    // entry
    public static void main(String[] args) {

        // Loop - Repeated pattern

        // print 0 to 9 on the console
        System.out.println(0);
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        System.out.println(6);
        System.out.println(7);
        System.out.println(8);
        System.out.println(9);

        System.out.println("----------------");
        int a;
        // (initiate; condition(true / false); ++ / --)
        for (a = 0; a < 10; a++) {
            System.out.print(a + ", ");
            // 수행문(run the condition is true)
            // 숫자 0 을 a 변수로 치환
            // 1. a = 0, 0 < 10, true, do it again!
            // 2. a = 1, 1 < 10, true
            // 3. a = 2, 2 < 10, true
            // 4. a = 3, 3 < 10, true
            // 5. a = 4, 4 < 10, true
            // 6. a = 5, 5 < 10, true
            // 7. a = 6, 6 < 10, true
            // 8. a = 7, 7 < 10, true
            // 9. a = 8, 8 < 10, true
            // 10. a = 9, 9 < 10, true
            // 11. a = 10, 10 < 10, false, end of for!

        } // end of for
        System.out.println();
        System.out.println("final a value = " + a);

    } // end of main
} // end of class
