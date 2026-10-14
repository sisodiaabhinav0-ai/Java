import java.util.Scanner;

// Q10. Sum of each column in a matrix
public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns: ");
        int r = sc.nextInt(), c = sc.nextInt();
        int[][] m = new int[r][c];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                m[i][j] = sc.nextInt();
        for (int j = 0; j < c; j++) {
            int sum = 0;
            for (int i = 0; i < r; i++) sum += m[i][j];
            System.out.println("Sum of column " + (j + 1) + " = " + sum);
        }

        sc.close();
    }
}
