import java.util.Scanner;

// Q23. Celsius to Fahrenheit using type casting
public class Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        int rounded = (int) fahrenheit;    // explicit type casting
        System.out.println("Temperature in Fahrenheit = " + fahrenheit);
        System.out.println("Fahrenheit after casting to int = " + rounded);

        sc.close();
    }
}
