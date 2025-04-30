package ch07;

/**
 *  함수 호출과 스택 메모리
 */
public class FunctionMainTest2 {
    // main entry
    public static void main(String[] args) {

        int num1;
        int num2;
        int mul1Result1 = mul1(10, 2);
        System.out.println("mul1Result1 = " + mul1Result1);

    } // end of main

    static int mul1 (int n1, int n2) {
        // int result = n1 * n2;
        return n1 * n2;
    } // end of mul1

} // end of class
