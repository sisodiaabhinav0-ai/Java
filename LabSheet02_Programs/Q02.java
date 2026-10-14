import java.util.Scanner;

// Q2. Compound interest
public class Q02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double p = sc.nextDouble();
        System.out.print("Enter rate of interest (% per annum): ");
        double r = sc.nextDouble();
        System.out.print("Enter time (in years): ");
        double t = sc.nextDouble();
        double amount = p * Math.pow(1 + r / 100, t);
        double ci = amount - p;
        System.out.printf("Total amount = %.2f%n", amount);
        System.out.printf("Compound interest = %.2f%n", ci);

        sc.close();
    }
}
