package ch02;

/**
 * 증감, 감소 연산자 ++, -- (only +/- 1) Increment, Decrement operator
 */
public class Operator2 {
    // entry
    public static void main(String[] args) {
        
        int a = 1;
        a++; // only 1 addition
        System.out.println("a = " + a);
        int b = 1;
        b--; // only 1 subtraction
        System.out.println("b = " + b);

        int c = 100;
        // System.out.println(c--); // subtract after this print = postfix
        System.out.println(--c); // subtract before this print = prefix
        System.out.println(c);

    } // end of main
} // end of class

