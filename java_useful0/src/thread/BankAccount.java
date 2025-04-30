package thread;

/**
 * Shared Resources; 각 thread 가 공유하는 자원
 */
//250425.1100.
public class BankAccount {

    private int money = 100_000;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    // 입금 deposit
    //public synchronized void deposit(int money) {
    public synchronized void deposit(int money) {
        int currentMoney = getMoney();
        // synchronized block;
        synchronized (this) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        //this.money += money;
        //            100_000 + 10_000
        setMoney(currentMoney + money);
        System.out.println("(deposit)current balance : " + getMoney());
    }

    // 출금 withdraw
    // synchronized method
    public synchronized int withdraw(int money) {
        int currentMoney = getMoney();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // defensive code

        if (currentMoney < money) {
            System.out.println("잔액부족");
            return 0;
        } else {
            // this.money -= money;
            //            100_000 - 5_000
            setMoney(currentMoney - money);
            System.out.println("(withdraw)current balance : " + getMoney());
            return 0;
        } // end of if

    }

}
