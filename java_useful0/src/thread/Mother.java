package thread;

public class Mother extends Thread {

    BankAccount bankAccount;

    public Mother(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void run() {
        // withdraw inquiry to account(0.5 sec)
        bankAccount.withdraw(5_000);
    }
}
