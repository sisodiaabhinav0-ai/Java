import java.util.Scanner;

// Q3. Distance between two points in a 2D plane
public class Q03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1 and y1: ");
        double x1 = sc.nextDouble(), y1 = sc.nextDouble();
        System.out.print("Enter x2 and y2: ");
        double x2 = sc.nextDouble(), y2 = sc.nextDouble();
        double dx = x2 - x1;
        double dy = y2 - y1;
        double distance = Math.sqrt(dx * dx + dy * dy);
        System.out.printf("Distance between the two points = %.2f%n", distance);

        sc.close();
    }
}
