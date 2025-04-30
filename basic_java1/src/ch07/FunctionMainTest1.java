package ch07;
// Code execution side
public class FunctionMainTest1 {
    // main function
    public static void main(String[] args) {

        // 여기에서 함수를 호출해서 사용가능
        int sub1Result1 = sub1(100, 50); // 함수 호출은 모양 맞추기!!!
        System.out.println("sub1Result1 = " + sub1Result1);
        int sub1Result2 = sub1(5, 1);
        System.out.println("sub1Result2 = " + sub1Result2);
//        함수호출시 모양을 잘 맞추어야한다
//        int sub1Result3 = (0.5, 1);
//        int sub1Result3 = (true, 1);
//        int sub1Result3 = ("a", 1);
//        int sub1Result3 = ('a', 1);
        // add1 함수호출
        int add1Result1 = add1(10, 25, 30); // 위치 중요함
        System.out.println("add1Result1 = " + add1Result1);

    } // end of main

    // 함수 선언 - 두 수를 받아서 뺄셈하는 함수
    static int sub1(int n1, int n2) {
        int result = n1 - n2;
        return result;
    } // end of sub1

    static int add1(int n1, int n2, int n3) {
        int result = n1 + n2 + n3;
        return result; // 실행의 제어권을 반납한다 = 호출한 곳으로 다시 돌아간다
    } // end of add1

} // end of class
