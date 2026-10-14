import java.util.Scanner;

// Q18. Search an element in a 3-D array and display its position
public class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][][] a = new int[2][2][2];
        System.out.println("Enter 8 elements of 2 x 2 x 2 array:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 2; k++)
                    a[i][j][k] = sc.nextInt();
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 2; k++)
                    if (a[i][j][k] == key) {
                        System.out.println("Element found at position [" + i + "][" + j + "][" + k + "]");
                        found = true;
                    }
        if (!found) System.out.println("Element not found");

        sc.close();
    }
}
