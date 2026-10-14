import java.util.Scanner;

// Q5. Explicit conversion of floating-point number to integer
public class Q05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a floating-point number: ");
        double d = sc.nextDouble();
        int i = (int) d;    // explicit type casting (decimal part is dropped)
        System.out.println("Original value  = " + d);
        System.out.println("Converted value = " + i);

        sc.close();
    }
}
