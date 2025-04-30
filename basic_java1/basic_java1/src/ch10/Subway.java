package ch10;

public class Subway {

    int lineNumber;
    int count;
    int money;

    public Subway(int num) {
        lineNumber = num;
    }

    public void take(int pay) {
        money += pay;
        count++;
    }

    public void showInfo() {
        System.out.println("=== Subway Status ===");
        System.out.println("Subway line = " + lineNumber);
        System.out.println("People on the subway = " + count);
        System.out.println("Money sum of the subway = " + money);
    }

} // end of class
