import java.util.Scanner;

// Q8. Nested try-catch
public class Q08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};
        try {                                           // outer try: division
            System.out.print("Enter first number: ");
            int a = sc.nextInt();
            System.out.print("Enter second number: ");
            int b = sc.nextInt();
            int result = a / b;
            System.out.println("Division result = " + result);

            try {                                       // inner try: array access
                System.out.print("Enter array index: ");
                int index = sc.nextInt();
                System.out.println("Element at index " + index + " = " + arr[index]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch: Invalid array index");
            }
        } catch (ArithmeticException e) {
            System.out.println("Outer catch: Cannot divide by zero");
        }

        sc.close();
    }
}
