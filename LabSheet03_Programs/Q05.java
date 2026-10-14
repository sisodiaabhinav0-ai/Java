import java.util.Scanner;

// Q5. Count even and odd numbers in an array
public class Q05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter " + n + " integers:");
        int even = 0, odd = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i] % 2 == 0) even++;
            else odd++;
        }
        System.out.println("Even numbers = " + even);
        System.out.println("Odd numbers = " + odd);

        sc.close();
    }
}
