package ch04;

public class ForMainTest2 {
    // entry
    public static void main(String[] args) {

        int i;
        // print 2 times table
        for (i = 2; i < 10; i++) {
            System.out.println(i + " times table");
            for (int a = 1; a < 10; a++) {
                System.out.println(i + " * " + a + " = " + (a * i));
            } // inner for
            System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡ");
        } // outer for


    } // end of main
} // end of class
