package ch02;

public class DataType3 {
    // entry
    public static void main(String[] args) {

        // DT Float?
        // meaning the numbers which are not integer
        // 3.14, 0.5, 1.55...
        // float 4 byte & double 8 byte
        // L value & R value
        float floatBox1 = 0.5F;
        // 'F' is needed to indicate it is in float DT,
        // bc it is thinking the float number as double DT basically
        double doubleBox1 = 0.123;

        // R value 기본연산단위
        // integer = int(4 byte), float = double(8 byte)
        long a = 2200000000L;
        // basic unit is int DT, so we need to add 'L' to indicate it is in long DT
        // we are using double DT as the basic bc it is more precise to express the number than the float

    } // end of main
} // end of class
