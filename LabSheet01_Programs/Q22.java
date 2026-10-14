import java.util.Scanner;

// Q22. Square or rectangle
public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = sc.nextDouble();
        System.out.print("Enter breadth: ");
        double breadth = sc.nextDouble();
        if (length == breadth)
            System.out.println("It is a Square");
        else
            System.out.println("It is a Rectangle (not a square)");

        sc.close();
    }
}
