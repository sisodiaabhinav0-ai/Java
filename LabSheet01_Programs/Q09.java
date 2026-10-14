import java.util.Scanner;

// Q9. Total, percentage and pass/fail of three subjects
public class Q09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of three subjects (out of 100): ");
        int m1 = sc.nextInt(), m2 = sc.nextInt(), m3 = sc.nextInt();
        int total = m1 + m2 + m3;
        double percentage = (total / 300.0) * 100;
        System.out.println("Total      = " + total + " / 300");
        System.out.printf("Percentage = %.2f%%%n", percentage);
        if (m1 >= 40 && m2 >= 40 && m3 >= 40)
            System.out.println("Result: PASS");
        else
            System.out.println("Result: FAIL");

        sc.close();
    }
}
