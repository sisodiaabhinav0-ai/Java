import java.util.Scanner;

// Q15. Armstrong number (3-digit)
public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        int n = sc.nextInt();
        if (n >= 100 && n <= 999) {
            int a = n / 100;          // hundreds digit
            int b = (n / 10) % 10;    // tens digit
            int c = n % 10;           // ones digit
            int sum = a * a * a + b * b * b + c * c * c;
            if (sum == n)
                System.out.println(n + " is an Armstrong number");
            else
                System.out.println(n + " is NOT an Armstrong number");
        } else {
            System.out.println("Please enter a valid 3-digit number");
        }

        sc.close();
    }
}
