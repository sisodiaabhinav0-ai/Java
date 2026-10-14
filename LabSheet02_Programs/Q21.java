import java.util.Scanner;

// Q21. Factors of a number using do-while
public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int n = sc.nextInt();
        int i = 1;
        System.out.println("Factors of " + n + ":");
        do {
            if (n % i == 0) System.out.print(i + " ");
            i++;
        } while (i <= n);
        System.out.println();

        sc.close();
    }
}
