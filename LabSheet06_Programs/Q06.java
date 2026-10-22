import java.util.Scanner;

// Q6. Using throw
public class Q06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student's marks: ");
        int marks = sc.nextInt();
        try {
            if (marks < 0 || marks > 100) {
                throw new IllegalArgumentException("Invalid marks! Marks must be between 0 and 100");
            }
            System.out.println("Marks entered = " + marks);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
