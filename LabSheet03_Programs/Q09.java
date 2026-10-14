import java.util.Scanner;

// Q9. Sum of each row in a matrix
public class Q09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns: ");
        int r = sc.nextInt(), c = sc.nextInt();
        int[][] m = new int[r][c];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                m[i][j] = sc.nextInt();
        for (int i = 0; i < r; i++) {
            int sum = 0;
            for (int j = 0; j < c; j++) sum += m[i][j];
            System.out.println("Sum of row " + (i + 1) + " = " + sum);
        }

        sc.close();
    }
}
