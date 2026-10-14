import java.util.Scanner;

// Q30. Simple calculator using if-else
public class Q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers (a b): ");
        double a = sc.nextDouble(), b = sc.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);
        if (op == '+')
            System.out.println(a + " + " + b + " = " + (a + b));
        else if (op == '-')
            System.out.println(a + " - " + b + " = " + (a - b));
        else if (op == '*')
            System.out.println(a + " * " + b + " = " + (a * b));
        else if (op == '/') {
            if (b != 0)
                System.out.println(a + " / " + b + " = " + (a / b));
            else
                System.out.println("Division by zero is not possible");
        } else
            System.out.println("Invalid operator");

        sc.close();
    }
}
