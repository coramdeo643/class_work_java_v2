package ch07;

public class FunctionMainTest3 {
    public static void main(String[] args) {
        
        FunctionMainTest3 f1 = new FunctionMainTest3();
        f1.age = 10;
        FunctionMainTest3 f2 = new FunctionMainTest3();
        f2.age = 20;
        
        int addResult1 = add(10, 20);
        System.out.println("addResult1 = " + addResult1);
        
    } // end of main
    
    // 함수를 만들어보세요
    // static void a () {}
    
    int age;
    
    // 덧셈
    static int add (int a, int b) {
        return a + b;
    }
    // 뺄셈
    static int sub (int a, int b) {
        return a - b;
    }
    // 나눗셈
    static int div (int a, int b) {
        return a / b;
    }
    // 곱셈
    static int mul (int a, int b) {
        return a * b;
    }
    
} // end of class
