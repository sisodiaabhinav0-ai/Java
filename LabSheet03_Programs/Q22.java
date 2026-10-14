import java.util.Scanner;

// Q22. Count how many times each element appears in a 1-D array
public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        boolean[] counted = new boolean[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (counted[i]) continue;
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (a[j] == a[i]) {
                    count++;
                    counted[j] = true;
                }
            }
            System.out.println(a[i] + " appears " + count + " time(s)");
        }

        sc.close();
    }
}
