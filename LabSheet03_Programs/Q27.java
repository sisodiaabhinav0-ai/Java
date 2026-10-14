import java.util.Scanner;

// Q27. Print only the boundary elements of a matrix
public class Q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns: ");
        int r = sc.nextInt(), c = sc.nextInt();
        int[][] m = new int[r][c];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                m[i][j] = sc.nextInt();
        System.out.println("Boundary elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i == 0 || j == 0 || i == r - 1 || j == c - 1)
                    System.out.print(m[i][j] + "\t");
                else
                    System.out.print(" \t");
            }
            System.out.println();
        }

        sc.close();
    }
}
