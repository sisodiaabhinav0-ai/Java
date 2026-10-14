import java.util.Scanner;

// Q25. Sum of main and secondary diagonal of a square matrix
public class Q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter order of square matrix: ");
        int n = sc.nextInt();
        int[][] m = new int[n][n];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                m[i][j] = sc.nextInt();
        int mainDiag = 0, secDiag = 0;
        for (int i = 0; i < n; i++) {
            mainDiag += m[i][i];
            secDiag += m[i][n - 1 - i];
        }
        System.out.println("Sum of main diagonal = " + mainDiag);
        System.out.println("Sum of secondary diagonal = " + secDiag);

        sc.close();
    }
}
