import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// Q11. Bank withdrawal system
public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter account balance: ");
            double balance = Double.parseDouble(sc.nextLine());
            System.out.print("Enter withdrawal amount: ");
            double amount = Double.parseDouble(sc.nextLine());

            if (balance < 0 || amount < 0) {
                throw new IllegalArgumentException("Balance or withdrawal amount cannot be negative");
            }
            if (amount > balance) {
                throw new InsufficientBalanceException("Insufficient balance! Available: " + balance + ", requested: " + amount);
            }
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance = " + balance);
        } catch (NumberFormatException e) {         // must come before IllegalArgumentException (its parent)
            System.out.println("Error: Invalid numeric input");
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Bank transaction completed.");
        }

        sc.close();
    }
}
