import java.util.Scanner;

// Q10. Greatest of two numbers
public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers (a b): ");
        int a = sc.nextInt(), b = sc.nextInt();
        if (a > b)
            System.out.println(a + " is greater");
        else if (b > a)
            System.out.println(b + " is greater");
        else
            System.out.println("Both numbers are equal");

        sc.close();
    }
}
