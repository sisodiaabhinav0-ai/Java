import java.util.Scanner;

// Q5. Negative value of an integer using unary operators
public class Q05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        int negative = -n;           // unary minus
        int negative2 = ~n + 1;      // unary bitwise NOT + 1 (two's complement)
        System.out.println("Negative value using unary minus (-n) = " + negative);
        System.out.println("Negative value using (~n + 1) = " + negative2);

        sc.close();
    }
}
