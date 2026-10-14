import java.util.Scanner;

// Q11. Student pass check (theory AND practical OR overall)
public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter theory marks (%): ");
        double theory = sc.nextDouble();
        System.out.print("Enter practical marks (%): ");
        double practical = sc.nextDouble();
        System.out.print("Enter overall marks (%): ");
        double overall = sc.nextDouble();
        // (theory >= 40 AND practical >= 50) OR overall >= 50
        if ((theory >= 40 && practical >= 50) || overall >= 50)
            System.out.println("Student PASSES the course");
        else
            System.out.println("Student FAILS the course");

        sc.close();
    }
}
