import java.util.Scanner;

// Q24. Remove duplicate elements from a 1-D array (no collections)
public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] unique = new int[n];
        int count = 0;
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        for (int i = 0; i < n; i++) {
            boolean duplicate = false;
            for (int j = 0; j < count; j++) {
                if (unique[j] == a[i]) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) unique[count++] = a[i];
        }
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < count; i++) System.out.print(unique[i] + " ");
        System.out.println();

        sc.close();
    }
}
