import java.util.Scanner;

// Q2. Input 10 integers and display them in reverse order
public class Q02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[10];
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) a[i] = sc.nextInt();
        System.out.println("Reverse order:");
        for (int i = 9; i >= 0; i--) System.out.print(a[i] + " ");
        System.out.println();

        sc.close();
    }
}
