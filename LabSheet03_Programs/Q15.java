import java.util.Scanner;

// Q15. Sum of all elements in a 3-D array
public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][][] a = new int[2][2][2];
        int sum = 0;
        System.out.println("Enter 8 elements of 2 x 2 x 2 array:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 2; k++) {
                    a[i][j][k] = sc.nextInt();
                    sum += a[i][j][k];
                }
        System.out.println("Sum of all elements = " + sum);

        sc.close();
    }
}
