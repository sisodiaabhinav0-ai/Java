// Q12. Synchronized block with a dedicated lock object
class BankAccount {
    private int balance;
    private final Object lock = new Object();    // dedicated lock object

    BankAccount(int balance) {
        this.balance = balance;
    }

    void withdraw(int amount) {
        // only the statements that read/update the balance are locked
        synchronized (lock) {
            if (balance >= amount) {
                int temp = balance;
                Thread.yield();
                balance = temp - amount;
            }
        }
    }

    int getBalance() {
        return balance;
    }
}

class WithdrawThread extends Thread {
    private BankAccount account;

    WithdrawThread(BankAccount account) {
        this.account = account;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            account.withdraw(1);
        }
    }
}

public class Q12 {
    public static void main(String[] args) throws InterruptedException {
        for (int round = 1; round <= 5; round++) {
            BankAccount account = new BankAccount(2000);
            WithdrawThread t1 = new WithdrawThread(account);
            WithdrawThread t2 = new WithdrawThread(account);
            t1.start();
            t2.start();
            t1.join();
            t2.join();
            int expected = 0;    // 2000 - (1000 + 1000) * 1
            System.out.println("Round " + round + ": expected balance = " + expected
                    + ", actual balance = " + account.getBalance()
                    + (account.getBalance() == expected ? "  (correct)" : "  (WRONG)"));
        }
    }
}
