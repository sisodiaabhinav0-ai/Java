import java.util.Scanner;

// Q11. Transpose of a matrix
public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns: ");
        int r = sc.nextInt(), c = sc.nextInt();
        int[][] m = new int[r][c];
        int[][] t = new int[c][r];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++) {
                m[i][j] = sc.nextInt();
                t[j][i] = m[i][j];
            }
        System.out.println("Transpose of matrix:");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++)
                System.out.print(t[i][j] + "\t");
            System.out.println();
        }

        sc.close();
    }
}
