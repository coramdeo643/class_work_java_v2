package ch02;

public class ConstantTest {
    //entry
    public static void main(String[] args) {

        // declare constant
        // use CAPITAL and _(under_bar) for variable name of constant
        // use keyword 'final'
        final int MAX_NUM = 100;
        // MAX_NUM = 1; constant is not able to change the value; initiation for only once
        final int MIN_NUM;
        MIN_NUM = 10; // initiate once
        // MIN_NUM = 20; no initiate twice
        System.out.println("----------------");
        // pi constant declaration
        final double PI = 3.14159;
        // radius of a circle declaration
        final int RADIUS = 5;
        // calculate the circumference(cir.)
        // 2 * PI * radius
        double num1 = 2 * PI * RADIUS;
        System.out.println(num1);
        // calculate the area of a circle
        double area = RADIUS * RADIUS * PI;
        System.out.println(area);

    } // end of main
} // end of class
