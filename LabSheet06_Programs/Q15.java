import java.util.Scanner;

class InvalidQuantityException extends Exception {
    public InvalidQuantityException(String message) {
        super(message);
    }
}

class InsufficientMedicineStockException extends Exception {
    public InsufficientMedicineStockException(String message) {
        super(message);
    }
}

// Q15. Pharmacy inventory system
public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter medicine name: ");
        String medicine = sc.nextLine();
        try {
            System.out.print("Enter available quantity: ");
            int available = Integer.parseInt(sc.nextLine());
            System.out.print("Enter required quantity: ");
            int required = Integer.parseInt(sc.nextLine());

            if (available < 0 || required < 0) {
                throw new InvalidQuantityException("Quantity cannot be negative");
            }
            if (required > available) {
                throw new InsufficientMedicineStockException("Insufficient stock of " + medicine
                        + "! Available: " + available + ", required: " + required);
            }
            System.out.println(required + " units of " + medicine + " issued. Remaining stock = " + (available - required));
        } catch (NumberFormatException e) {
            System.out.println("Error: Quantity must be a whole number");
        } catch (InvalidQuantityException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InsufficientMedicineStockException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Inventory transaction completed.");
        }

        sc.close();
    }
}
