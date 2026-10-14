import java.util.Scanner;

// Q25. Logical operation on two integers using operator character
public class Q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // integers are combined bit by bit using the logical operators & (AND), | (OR), ^ (XOR)
        System.out.print("Enter two integers (a b): ");
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.print("Enter logical operator (& for AND, | for OR, ^ for XOR): ");
        char op = sc.next().charAt(0);
        if (op == '&')
            System.out.println(a + " & " + b + " = " + (a & b));
        else if (op == '|')
            System.out.println(a + " | " + b + " = " + (a | b));
        else if (op == '^')
            System.out.println(a + " ^ " + b + " = " + (a ^ b));
        else
            System.out.println("Invalid operator");

        sc.close();
    }
}
