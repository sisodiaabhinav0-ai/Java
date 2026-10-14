import java.util.Scanner;

// Q24. Perfect number check
public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) sum += i;     // add all proper divisors
        }
        if (n > 0 && sum == n)
            System.out.println(n + " is a Perfect number");
        else
            System.out.println(n + " is NOT a Perfect number");

        sc.close();
    }
}
