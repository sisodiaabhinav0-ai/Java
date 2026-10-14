import java.util.Scanner;

// Q20. Password check using do-while
public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correct = "java@123";   // correct password
        String entered;
        do {
            System.out.print("Enter password: ");
            entered = sc.next();
            if (!entered.equals(correct))
                System.out.println("Wrong password, try again.");
        } while (!entered.equals(correct));
        System.out.println("Correct password! Access granted.");

        sc.close();
    }
}
