package com._static;

public class PrinterTest1 {
    // main entry
    public static void main(String[] args) {

        // int a = 10;
        // static int b = 20;
        // static variable is like the sun.
        // Everyone share the sun.
        // static is for all.
        // .

        NumberPrinter n1 = new NumberPrinter(1);
        NumberPrinter n2 = new NumberPrinter(2);

        n1.printWaitNumber();
        n2.printWaitNumber();
        n1.printWaitNumber();
        n1.printWaitNumber();
        n1.printWaitNumber();
        n2.printWaitNumber();
        n1.printWaitNumber();
        n1.printWaitNumber();

    } // end of main
} // end of class
