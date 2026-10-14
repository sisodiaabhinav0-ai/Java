import java.util.Scanner;

// Q6. Copy all elements from one array to another
public class Q06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        for (int i = 0; i < n; i++) b[i] = a[i];
        System.out.println("Copied array:");
        for (int i = 0; i < n; i++) System.out.print(b[i] + " ");
        System.out.println();

        sc.close();
    }
}
