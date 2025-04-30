package ch02;

public class Operator1 {
    // entry
    public static void main(String[] args) {
        // initiation of variable
        int a = 5;
        int b = 2;
        // plus
        int sum = a + b;
        System.out.println("a + b = " + sum);
        // minus
        int diff = a - b;
        System.out.println("a - b = " + diff);
        // multi
        int multi = a * b;
        System.out.println("a * b = " + multi);
        // divide, recommend to do type casting to be more precise
        // one of the value should be the float to get float result
        double div = (double)a / b;
        System.out.println("a / b = " + div);
        // modulus
        double mod = (double)a % b;
        System.out.println("a % b = " + mod);
        System.out.println("-----------------");
        // 1. print (12 + 3) / 3
        System.out.println((12 + 3) / (double)3);
        // 2. print (25 % 2)
        // % 2 = 0, even / % 2 = 1, odd
        System.out.println(25 % 2); // 1 = odd
        System.out.println(26 % 2); // 0 = even

    } // end of main
} // end of class

