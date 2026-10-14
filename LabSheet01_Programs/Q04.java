import java.util.Scanner;

// Q4. Relational operators on two numbers
public class Q04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers (a b): ");
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a >  b : " + (a > b));
        System.out.println("a <  b : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));

        sc.close();
    }
}
