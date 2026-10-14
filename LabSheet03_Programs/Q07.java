import java.util.Scanner;

// Q7. Input and display a 3 x 3 matrix
public class Q07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] m = new int[3][3];
        System.out.println("Enter 9 elements of 3 x 3 matrix:");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                m[i][j] = sc.nextInt();
        System.out.println("Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(m[i][j] + "\t");
            System.out.println();
        }

        sc.close();
    }
}
