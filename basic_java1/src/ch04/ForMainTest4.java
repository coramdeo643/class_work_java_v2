package ch04;

public class ForMainTest4 {
    // entry
    public static void main(String[] args) {

        // 1 ~ 100 중에 홀수 총합?
        int sum = 0;
        int totalSum = 0;
        for (int a = 1; a < 101; a++) {
            if (a % 2 != 0) {
                System.out.println(a + "(홀수확인)");
                sum += a;
            } // end of if
            totalSum = totalSum + a;
        } // end of for
        System.out.println("SUM : " + sum);
        System.out.println("짝수, 홀수 총합 : " + totalSum);

        System.out.println("---------------------------------");
        // 증감식 1 이상 증가 가능
        for (int i = 2; i < 101; i+=2) {
            System.out.println("i : " + i);
        } // end of for

        // 10, 9, 8, 7...
        int a;
        for (a = 10; a > 1; a--) {
            System.out.print(a + ", ");
        } // end of for
        System.out.println(a);


    } // end of main
} // end of class
