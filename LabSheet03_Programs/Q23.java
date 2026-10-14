import java.util.Scanner;

// Q23. Second largest element in a 1-D array
public class Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array (at least 2): ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (a[i] > first) {
                second = first;
                first = a[i];
            } else if (a[i] > second && a[i] != first) {
                second = a[i];
            }
        }
        if (second == Integer.MIN_VALUE)
            System.out.println("No second largest element");
        else
            System.out.println("Second largest element = " + second);

        sc.close();
    }
}
