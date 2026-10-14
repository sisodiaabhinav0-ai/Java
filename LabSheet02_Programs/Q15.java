import java.util.Scanner;

// Q15. Count set bits using bitwise operators
public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        int temp = n;
        int count = 0;
        while (temp != 0) {
            count += temp & 1;   // check last bit
            temp >>>= 1;         // shift right
        }
        System.out.println("Binary of " + n + " = " + Integer.toBinaryString(n));
        System.out.println("Number of set bits (1s) = " + count);

        sc.close();
    }
}
