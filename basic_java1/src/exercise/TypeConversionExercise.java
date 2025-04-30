package exercise;

public class TypeConversionExercise {
    // entry
    public static void main(String[] args) {

        int a = 300;
        double b = a; // auto TC
        System.out.println(b); // 300.0

        double c = 5.67;
        int d = (int)c; // manual TC
        System.out.println(d); // 5

        float floatNum = 4.5f;
        int intNum = (int)floatNum; // manual TC
        System.out.println(intNum); // 4

        double largeValue = 150.75;
        byte byteValue = (byte)largeValue; // manual TC
        System.out.println(byteValue);

    } // end of main
} // end of class
