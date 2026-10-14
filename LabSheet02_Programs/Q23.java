import java.util.Scanner;

// Q23. Palindrome number using while
public class Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        int temp = n;
        int reverse = 0;
        while (temp > 0) {
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }
        if (n >= 0 && reverse == n)
            System.out.println(n + " is a palindrome");
        else
            System.out.println(n + " is not a palindrome");

        sc.close();
    }
}
