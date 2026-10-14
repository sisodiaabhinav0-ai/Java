import java.util.Scanner;

// Q21. Rotate an array to the left by one position
public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int first = a[0];
        for (int i = 0; i < n - 1; i++) a[i] = a[i + 1];
        a[n - 1] = first;
        System.out.println("Array after left rotation by one position:");
        for (int i = 0; i < n; i++) System.out.print(a[i] + " ");
        System.out.println();

        sc.close();
    }
}
