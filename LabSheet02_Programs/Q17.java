import java.util.Scanner;

// Q17. Rotate bits of an integer to the left by 2 positions
public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        int rotated = (n << 2) | (n >>> 30);   // rotate left by 2 (32-bit int)
        System.out.println("Original: " + String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0') + "  (" + n + ")");
        System.out.println("Rotated : " + String.format("%32s", Integer.toBinaryString(rotated)).replace(' ', '0') + "  (" + rotated + ")");

        sc.close();
    }
}
