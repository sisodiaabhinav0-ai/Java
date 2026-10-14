import java.util.Scanner;

// Q1. Area of a triangle using Heron's formula
public class Q01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three sides of the triangle (a b c): ");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        if (a + b > c && b + c > a && a + c > b) {
            double s = (a + b + c) / 2;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.println("Semi-perimeter = " + s);
            System.out.printf("Area of triangle = %.2f%n", area);
        } else {
            System.out.println("These sides cannot form a triangle");
        }

        sc.close();
    }
}
