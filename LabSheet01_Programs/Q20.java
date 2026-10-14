import java.util.Scanner;

// Q20. Marriage eligibility using nested if-else
public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Enter gender (M/F): ");
        char gender = sc.next().charAt(0);
        if (gender == 'M' || gender == 'm') {
            if (age >= 21)
                System.out.println("Eligible for marriage");
            else
                System.out.println("Not eligible for marriage (male must be 21 or above)");
        } else if (gender == 'F' || gender == 'f') {
            if (age >= 18)
                System.out.println("Eligible for marriage");
            else
                System.out.println("Not eligible for marriage (female must be 18 or above)");
        } else {
            System.out.println("Invalid gender entered");
        }

        sc.close();
    }
}
