import java.util.Scanner;

// Q19. Valid operator check and operation on two numbers
public class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an operator (+, -, *, /): ");
        char op = sc.next().charAt(0);
        if (op == '+' || op == '-' || op == '*' || op == '/') {
            System.out.println("Valid operator");
            System.out.print("Enter two numbers: ");
            double a = sc.nextDouble(), b = sc.nextDouble();
            if (op == '+')
                System.out.println("Result = " + (a + b));
            else if (op == '-')
                System.out.println("Result = " + (a - b));
            else if (op == '*')
                System.out.println("Result = " + (a * b));
            else {
                if (b != 0)
                    System.out.println("Result = " + (a / b));
                else
                    System.out.println("Division by zero is not possible");
            }
        } else {
            System.out.println("Invalid operator");
        }

        sc.close();
    }
}
