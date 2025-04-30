package thread;

public class BankAccountMainTest {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();

        Father father = new Father(bankAccount);
        Mother mother = new Mother(bankAccount);

        // Father inquire deposit
        father.start(); // 3 secs
        // Mother inquire withdraw
        mother.start(); // 0.5 secs

        // processing the deposit and withdraw at the same account
        // 100_000 + 10_000 - 5_000 = 105_000
        // 주의 ! In multi threading program,

        // race condition status could be made!
        // --> unexpected result!


    } // end of main
} // end of class
