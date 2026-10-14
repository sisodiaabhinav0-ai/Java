import java.util.Scanner;

// Q2. Arithmetic operations on two integers
public class Q02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two integers (a b): ");
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println("Addition       : " + (a + b));
        System.out.println("Subtraction    : " + (a - b));
        System.out.println("Multiplication : " + (a * b));
        if (b != 0) {
            System.out.println("Division       : " + (a / b));
            System.out.println("Modulus        : " + (a % b));
        } else {
            System.out.println("Division and modulus not possible (divisor is zero)");
        }

        sc.close();
    }
}
