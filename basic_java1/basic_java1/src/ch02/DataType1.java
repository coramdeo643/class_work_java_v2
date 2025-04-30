package ch02;

/**
 * Data type?
 * 변수라는 상자에 담을수있는 값의 종류와 크기를 정의하는 것
 * 상자의 크기에 따라서 담을수있는 값의 범위가 달라짐
 */
public class DataType1 {
    // entry
    public static void main(String[] args) {

        // Data type into 2
        // 1. Primitive DT
        // --> Integer(byte+short+int+long) / Character(char) / Float(+double) / Boolean
        // 2. Reference DT
        // Integer = 소수점이 없는 숫자
        byte smallBox; // 1 byte(8) 128
        short mediumBox; // 2 byte(16) 3.2만
        int standardBox; // 4 byte(32) 21억
        long largeBox; // 8 byte(64) 9경
        // Declared the variable, size = 1 byte = 8 bits
        // Binary = 0 & 1
        // [] [] [] [] [] [] [] []
        // 2  4  8 16 32 64 128 256

        smallBox = -128;
        smallBox = 127;
        mediumBox = -32768;
        mediumBox = 32767;
        standardBox = -2147483648;
        standardBox = 2147483647;
        // 접미사 L = long Date type
        largeBox = 9000000000000000000L;
        System.out.println("largeBox = " + largeBox);

    } // end of main

} // end of class
