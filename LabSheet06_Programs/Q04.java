import java.util.Scanner;

// Q4. Multiple catch blocks
public class Q04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};
        try {
            System.out.print("Enter first number: ");
            int a = Integer.parseInt(sc.nextLine());
            System.out.print("Enter second number: ");
            int b = Integer.parseInt(sc.nextLine());
            int result = a / b;
            System.out.println("Division result = " + result);

            System.out.print("Enter array index: ");
            int index = Integer.parseInt(sc.nextLine());
            System.out.println("Element at index " + index + " = " + arr[index]);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index (valid index is 0 to 4)");
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integers only");
        }

        sc.close();
    }
}
