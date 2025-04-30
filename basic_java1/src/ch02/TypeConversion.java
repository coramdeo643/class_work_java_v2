package ch02;

/**
 * Type casting?
 * convert the data type to another
 * auto(widen) & manual(narrow)
 */
public class TypeConversion {
    // entry
    public static void main(String[] args) {

        // auto TC
        int intDataBox = 50;
        System.out.println(intDataBox);
        // widening type casting, smaller to larger
        double doubleDataBox = intDataBox;
        System.out.println(doubleDataBox);

        // manual TC
        final double PI = 3.14159;
        // int intBox = PI; // compile time error
        int intBox = (int)PI; // It is ok we lose some data, just print out!
        System.out.println(intBox); // intBox = 3

        double interestRate;
        int discount;
        interestRate = 15.5;
        // discount = interestRate; double in int? 8 byte in 4 byte? no way...
        discount = (int)interestRate; // manual TC!
        System.out.println(discount); // discount = 15

        // advanced
        System.out.println((int)7.5); // manual TC
        System.out.println((int)0.123); // manual TC

    } // end of main
} // end of class
