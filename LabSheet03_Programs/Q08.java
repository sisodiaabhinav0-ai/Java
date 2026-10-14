import java.util.Scanner;

// Q8. Sum of all elements in a matrix
public class Q08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns: ");
        int r = sc.nextInt(), c = sc.nextInt();
        int[][] m = new int[r][c];
        System.out.println("Enter matrix elements:");
        int sum = 0;
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++) {
                m[i][j] = sc.nextInt();
                sum += m[i][j];
            }
        System.out.println("Sum of all elements = " + sum);

        sc.close();
    }
}
