import java.util.Scanner;

// Q6. Reduce a number by half using /= and count steps
public class Q06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double n = sc.nextDouble();
        int steps = 0;
        while (n >= 1) {
            n /= 2;
            steps++;
            System.out.println("Step " + steps + ": " + n);
        }
        System.out.println("Number of steps to become less than 1 = " + steps);

        sc.close();
    }
}
