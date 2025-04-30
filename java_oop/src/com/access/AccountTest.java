package com.access;

public class AccountTest {
    // main entry
    public static void main(String[] args) {

        Account account = new Account();
        account.deposit(10_000);
        account.withdraw(6_000);
        account.showInfo();

        // 접근 제어자 문법, 왜 사용하는가?
        // 신입 개발자가 실수로 메서드를 통해서 코드를 작성한게 아니라
        // 바로 멤버 변수에 접근해서 수정하는 코드를 작성해버렸다!!!
        // account.balance = 10_000; // 입금 명령어 작성!
        account.showInfo();
        // 실수할수있는 가능성 생겼다!!!
        // balance 변수를 외부에서 안보이게 접근을 차단해보자!
        // private 으로 class 외부 access block!

        // 외부에서는 오직 출금기능, 입금기능 method 로만 사용이 가능하다
        // = encapsulation

        // 현재 잔액 출력하고 싶다
        int outerBalance = account.getBalance();
        System.out.println(">>> 현재 잔액 : $ " + outerBalance + " <<<");
        // 자바에서 멤버 변수 값을 초기화 하지않으면 String 에서는 null 로 초기화
        System.out.println(account.getName());

        // setter method practice
        account.setBalance(0);
        // account.balance = 0; What is the different?
        account.showInfo();

    } // end of main
} // end of class
