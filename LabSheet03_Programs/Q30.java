import java.util.Scanner;

// Q30. Check if a matrix is a sparse matrix
public class Q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns: ");
        int r = sc.nextInt(), c = sc.nextInt();
        int[][] m = new int[r][c];
        int zeros = 0, nonZeros = 0;
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++) {
                m[i][j] = sc.nextInt();
                if (m[i][j] == 0) zeros++;
                else nonZeros++;
            }
        System.out.println("Zero elements = " + zeros);
        System.out.println("Non-zero elements = " + nonZeros);
        if (zeros > nonZeros)
            System.out.println("The matrix is a SPARSE matrix");
        else
            System.out.println("The matrix is NOT a sparse matrix");

        sc.close();
    }
}
