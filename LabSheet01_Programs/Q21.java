import java.util.Scanner;

// Q21. Valid triangle from three angles
public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three angles (a b c): ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if (a > 0 && b > 0 && c > 0 && (a + b + c) == 180)
            System.out.println("The angles form a valid triangle");
        else
            System.out.println("The angles do NOT form a valid triangle");

        sc.close();
    }
}
