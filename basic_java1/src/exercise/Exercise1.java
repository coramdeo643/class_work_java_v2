package exercise;

public class Exercise1 {
    // entry point of the code
    public static void main(String[] args) {

        // 1. 은행계좌 잔액 변수 선언 및 초기화, 출력
        // Print as follow;
        // 현재 계좌 잔액 : 7000원
        int balance = 1000;
        System.out.println("현재 계좌 잔액 : " + balance + "원");

        // 2. 고객 나이를 변수에 담기 (22)
        // Print as follow;
        // 고객 나이 : 22세
        int customerAge = 22;
        System.out.println("고객 나이 : " + customerAge + "세");

        // 2.1 고객 나이를 28로 변경하고 원래 나이를 다른 변수에 저장
        // 주의; 원래있던 변수안에 값을 먼저 다른 변수에 저장을 해야 사라지지않습니다
        int originalAge = customerAge; // 새로운변수에 원래 있던 변수를 대임
        customerAge = 28;
        // 코드는 위에서 아래로 실행한다 the code is flowing from the top to the bottom
        System.out.println("수정된 고객 나이 = " + customerAge);
        System.out.println("원래 나이(기록용) = " + originalAge);

        // 3. 두 변수를 선언하고 값을 교환해보자 Exchange the values of the two variables without deletion
        // declare a new variable to put the value for the temporary storage
        int accountA = 2000;
        int accountB = 4500;
        int temp = accountA; // temp = 2000
        accountA = accountB; // accountA = 4500
        accountB = temp; // accountB = 2000
        System.out.println("accountA = " + accountA);
        System.out.println("accountB = " + accountB);

    } // end of main

} // end of class
