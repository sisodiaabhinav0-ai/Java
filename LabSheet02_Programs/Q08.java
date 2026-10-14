import java.util.Scanner;

// Q8. Check whether three angles form a valid triangle
public class Q08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three angles (a b c): ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if (a > 0 && b > 0 && c > 0 && (a + b + c) == 180)
            System.out.println("Valid triangle");
        else
            System.out.println("Not a valid triangle");

        sc.close();
    }
}
