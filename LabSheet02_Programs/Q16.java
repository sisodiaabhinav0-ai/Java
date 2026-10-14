import java.util.Scanner;

// Q16. Fast multiplication and division by powers of two using shifts
public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.print("Enter power of two (k, so that 2^k) : ");
        int k = sc.nextInt();
        long multiply = (long) n << k;   // n * 2^k
        int divide = n >> k;             // n / 2^k
        System.out.println(n + " * 2^" + k + " = " + multiply);
        System.out.println(n + " / 2^" + k + " = " + divide);

        sc.close();
    }
}
