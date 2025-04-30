package ch10;

public class Bus {

    // 1. 추상화
    int busNumber;
    int count;
    int money;

    // 2. 생성자
    // 객체 생성시에 제일 먼저 실행되는 부분
    public Bus(int num) {
        busNumber = num;
    }

    // 3. 메서드
    // 승객을 태우다
    public void take(int pay) {
        money += pay;
        count++;
    }

    public void showInfo() {
        System.out.println("--------- Bus Status ---------");
        System.out.println("Bus number : " + busNumber);
        System.out.println("People on the bus : " + count);
        System.out.println("Money sum of the bus : " + money);
    }


} // end of class
