import java.util.Scanner;

// Q26. Upper and lower triangular parts of a square matrix
public class Q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter order of square matrix: ");
        int n = sc.nextInt();
        int[][] m = new int[n][n];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                m[i][j] = sc.nextInt();
        System.out.println("Upper triangular part:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j >= i) System.out.print(m[i][j] + "\t");
                else System.out.print(" \t");
            }
            System.out.println();
        }
        System.out.println("Lower triangular part:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j <= i) System.out.print(m[i][j] + "\t");
                else System.out.print(" \t");
            }
            System.out.println();
        }

        sc.close();
    }
}
