/* Standalone Java solution for Question 2: Bank Account with Validation */
public class Question2 {
    static class BankAccount {
            private String accountNumber;
            private String accountHolder;
            private double balance;
    
            public String getAccountNumber() { return accountNumber; }
            public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }
            public String getAccountHolder() { return accountHolder; }
            public void setAccountHolder(String accountHolder) { this.accountHolder = accountHolder; }
            public double getBalance() { return balance; }
            public void setBalance(double balance) {
                if (balance >= 0) this.balance = balance;
                else System.out.println("Invalid balance: cannot be negative.");
            }
    
            public void deposit(double amount) {
                if (amount > 0) {
                    balance += amount;
                    System.out.println("Deposited: " + amount);
                } else {
                    System.out.println("Invalid deposit: amount must be greater than 0.");
                }
            }
    
            public void withdraw(double amount) {
                if (amount <= 0) {
                    System.out.println("Invalid withdrawal: amount must be greater than 0.");
                } else if (amount > balance) {
                    System.out.println("Invalid withdrawal: insufficient balance.");
                } else {
                    balance -= amount;
                    System.out.println("Withdrawn: " + amount);
                }
            }
        }

    public static void main(String[] args) {
                System.out.println("\\n=== Question 2: Bank Account with Validation ===");
                BankAccount account = new BankAccount();
                account.setAccountNumber("AC1001");
                account.setAccountHolder("Riya");
                account.setBalance(1000);
                account.deposit(500);
                account.withdraw(200);
                account.deposit(0);
                account.withdraw(5000);
                System.out.println("Account holder: " + account.getAccountHolder());
                System.out.println("Balance: " + account.getBalance());
            
    }
}
