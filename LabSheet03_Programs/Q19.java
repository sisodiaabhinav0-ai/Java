import java.util.Scanner;

// Q19. Jagged array with 3 rows of different lengths
public class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] jag = new int[3][];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter length of row " + (i + 1) + ": ");
            int len = sc.nextInt();
            jag[i] = new int[len];
            System.out.println("Enter " + len + " elements:");
            for (int j = 0; j < len; j++)
                jag[i][j] = sc.nextInt();
        }
        System.out.println("Jagged array:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < jag[i].length; j++)
                System.out.print(jag[i][j] + " ");
            System.out.println();
        }

        sc.close();
    }
}
