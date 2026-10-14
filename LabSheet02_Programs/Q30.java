import java.util.Scanner;

// Q30. Mixed advanced: power of 4, toggle 3rd bit, table with continue/break
public class Q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int n = sc.nextInt();

        // Step 1: check power of 4 using shift operators
        boolean powerOfFour = false;
        if (n > 0 && (n & (n - 1)) == 0) {   // power of 2 (only one set bit)
            int temp = n;
            int position = 0;
            while (temp > 1) {
                temp >>= 1;                  // shift right to find position of the set bit
                position++;
            }
            powerOfFour = (position % 2 == 0);  // set bit at even position => power of 4
        }
        System.out.println(n + (powerOfFour ? " is a power of 4" : " is NOT a power of 4"));

        // Step 2: toggle the 3rd bit (bit position 2, counting from right starting at 1)
        int toggled = n ^ (1 << 2);
        System.out.println("Binary before toggle = " + Integer.toBinaryString(n));
        System.out.println("Binary after toggle  = " + Integer.toBinaryString(toggled) + " (" + toggled + ")");

        // Step 3: multiplication table with continue and break
        System.out.println("Multiplication table of " + n + ":");
        for (int i = 1; i <= 10; i++) {
            int product = n * i;
            if (product % 48 == 0) {          // checked first, because every multiple of 48 is also a multiple of 6
                System.out.println(n + " x " + i + " = " + product + "  (multiple of 48, stopping)");
                break;
            }
            if (product % 6 == 0) continue;   // skip multiples of 6
            System.out.println(n + " x " + i + " = " + product);
        }

        sc.close();
    }
}
