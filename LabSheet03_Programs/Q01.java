import java.util.Scanner;

// Q1. Input and display 5 integers using a 1-D array
public class Q01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[5];
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) a[i] = sc.nextInt();
        System.out.println("Array elements:");
        for (int i = 0; i < 5; i++) System.out.print(a[i] + " ");
        System.out.println();

        sc.close();
    }
}
