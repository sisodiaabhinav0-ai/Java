import java.util.Scanner;

// Q7. Accumulate 7 days rainfall using +=
public class Q07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0;
        for (int day = 1; day <= 7; day++) {
            System.out.print("Enter rainfall (mm) for day " + day + ": ");
            double rain = sc.nextDouble();
            total += rain;
        }
        System.out.println("Total rainfall in 7 days = " + total + " mm");

        sc.close();
    }
}
