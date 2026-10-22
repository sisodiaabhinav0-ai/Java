import java.util.Scanner;

class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}

// Q10. User-defined exception (InvalidMarksException)
public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        try {
            if (marks < 0 || marks > 100) {
                throw new InvalidMarksException("Marks " + marks + " are invalid. Marks must be between 0 and 100");
            }
            System.out.println("Marks entered = " + marks + " (valid)");
        } catch (InvalidMarksException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
