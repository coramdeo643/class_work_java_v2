package thread;

public class Father extends Thread {

    BankAccount bankAccount;

    public Father(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void run() {
        // deposit inquiry to account, taking 3 sec, made in thread
        bankAccount.deposit(10_000);
    }


}
