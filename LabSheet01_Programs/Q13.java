import java.util.Scanner;

// Q13. Positive, negative or zero
public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double n = sc.nextDouble();
        if (n > 0)
            System.out.println(n + " is Positive");
        else if (n < 0)
            System.out.println(n + " is Negative");
        else
            System.out.println("The number is Zero");

        sc.close();
    }
}
