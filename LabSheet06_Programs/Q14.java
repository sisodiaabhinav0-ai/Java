import java.util.Scanner;

class InvalidExamMarksException extends Exception {
    public InvalidExamMarksException(String message) {
        super(message);
    }
}

// Q14. Online examination system
public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student's marks: ");
        String input = sc.nextLine();
        try {
            int marks = Integer.parseInt(input);
            if (marks < 0 || marks > 100) {
                throw new InvalidExamMarksException("Marks " + marks + " are invalid. Marks must be between 0 and 100");
            }
            if (marks >= 40)
                System.out.println("Marks = " + marks + " -> PASS");
            else
                System.out.println("Marks = " + marks + " -> FAIL");
        } catch (NumberFormatException e) {
            System.out.println("Error: Marks must be a number");
        } catch (InvalidExamMarksException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Exam evaluation completed.");
        }

        sc.close();
    }
}
