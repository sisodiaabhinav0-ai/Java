import java.util.Scanner;

// Q11. Largest of three numbers using nested if-else
public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers (a b c): ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int largest;
        if (a >= b) {
            if (a >= c) largest = a;
            else largest = c;
        } else {
            if (b >= c) largest = b;
            else largest = c;
        }
        System.out.println("Largest number = " + largest);

        sc.close();
    }
}
