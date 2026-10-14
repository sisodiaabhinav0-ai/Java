import java.util.Scanner;

// Q14. Swap two integers using XOR
public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two integers (a b): ");
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println("Before swap: a = " + a + ", b = " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swap : a = " + a + ", b = " + b);

        sc.close();
    }
}
