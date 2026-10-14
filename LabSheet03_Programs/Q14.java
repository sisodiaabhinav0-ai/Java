import java.util.Scanner;

// Q14. Input and display a 2 x 2 x 2 3-D array
public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][][] a = new int[2][2][2];
        System.out.println("Enter 8 elements of 2 x 2 x 2 array:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 2; k++)
                    a[i][j][k] = sc.nextInt();
        System.out.println("3-D array elements:");
        for (int i = 0; i < 2; i++) {
            System.out.println("Layer " + (i + 1) + ":");
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++)
                    System.out.print(a[i][j][k] + "\t");
                System.out.println();
            }
        }

        sc.close();
    }
}
