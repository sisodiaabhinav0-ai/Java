import java.util.Scanner;

// Q9. Exception propagation
public class Q09 {
    static void method3(int divisor) {
        System.out.println("method3() started");
        int result = 100 / divisor;      // ArithmeticException if divisor is 0
        System.out.println("method3() result = " + result);
    }

    static void method2(int divisor) {
        System.out.println("method2() started");
        method3(divisor);
        System.out.println("method2() ended");       // skipped if exception occurs
    }

    static void method1(int divisor) {
        System.out.println("method1() started");
        method2(divisor);
        System.out.println("method1() ended");       // skipped if exception occurs
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter divisor (enter 0 to see propagation): ");
        int divisor = sc.nextInt();
        try {
            method1(divisor);
        } catch (ArithmeticException e) {
            System.out.println("Exception handled in main(): " + e.getMessage());
        }
        sc.close();
    }
}
