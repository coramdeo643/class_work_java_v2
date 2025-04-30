package ch03;

public class Operation1 {
    // main entry
    public static void main(String[] args) {

        // bank account balance setting
        double balance = 1000.0;
        // string + float = string(return)
        System.out.println("initial balance : " + balance + "원");

        // 1. deposit : 5000원을 게좌에 추가 (원래있던 금액에서 추가)
        // 복한 대입 연산자 사용
        // balance = balance + 5000;
        balance += 5000;
        // float + integer = float(return)
        System.out.println("checking the account balance : " + balance + "원");

        // 2. withdrawal : 2000원
        // balance = balance - 2000;
        balance -= 2000; // 4000.0
        System.out.println("checking the account balance : " + balance + "원");

        // 3. multi
        // System.out.println(balance *= 2); // 8000.0
        // System.out.println(balance);

        // 잔액을 1000원 단위로 나누어 몫 계산 ( 예 : 1000원 쿠폰으로 교환 가능한 횟수)
        int coupons = (int)(balance / 1000);
        System.out.println("1000 원으로 쿠폰 교환 가능한 갯수 : " + coupons);
        System.out.println("checking the account balance : " + balance + "원");
        balance %= 1000;
        System.out.println("check. the acc. bal. after claiming coupons: " + balance + "원");

        // 복합 대입 연산자는 코드를 간결하게 만듬
        // 변수에 값을 바로 업데이트하므로
        // 실수 가능성을 줄임

    } // end of main
} // end of class
