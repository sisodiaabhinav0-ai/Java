import java.util.Scanner;

// Q7. Divisible by both 3 and 5 using logical operators
public class Q07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n % 3 == 0 && n % 5 == 0)
            System.out.println(n + " is divisible by both 3 and 5");
        else
            System.out.println(n + " is NOT divisible by both 3 and 5");

        sc.close();
    }
}
