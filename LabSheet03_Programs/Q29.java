import java.util.Scanner;

// Q29. Sort the elements of each row in a jagged array
public class Q29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        int[][] jag = new int[n][];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter length of row " + (i + 1) + ": ");
            int len = sc.nextInt();
            jag[i] = new int[len];
            System.out.println("Enter " + len + " elements:");
            for (int j = 0; j < len; j++)
                jag[i][j] = sc.nextInt();
        }
        // bubble sort on every row
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < jag[i].length - 1; j++) {
                for (int k = 0; k < jag[i].length - 1 - j; k++) {
                    if (jag[i][k] > jag[i][k + 1]) {
                        int temp = jag[i][k];
                        jag[i][k] = jag[i][k + 1];
                        jag[i][k + 1] = temp;
                    }
                }
            }
        }
        System.out.println("Jagged array after sorting each row:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < jag[i].length; j++)
                System.out.print(jag[i][j] + " ");
            System.out.println();
        }

        sc.close();
    }
}
