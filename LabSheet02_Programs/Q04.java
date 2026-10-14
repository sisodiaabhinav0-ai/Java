import java.util.Scanner;

// Q4. Prefix and postfix increment - store visitor counter
public class Q04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int choice;
        do {
            System.out.println("\n1. Visitor enters   2. Visitor leaves   0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            if (choice == 1) {
                // prefix: count increases first, then the new value is used
                System.out.println("Visitor entered. Count (prefix ++count) = " + (++count));
            } else if (choice == 2) {
                if (count == 0) {
                    System.out.println("Store is already empty");
                } else {
                    // postfix: old value is used first, then count decreases
                    System.out.println("Visitor leaving. Count before leaving (postfix count--) = " + (count--));
                    System.out.println("Count after leaving = " + count);
                }
            }
        } while (choice != 0);
        System.out.println("Final visitors inside the store = " + count);

        sc.close();
    }
}
