import java.util.Scanner;

class InvalidPatientAgeException extends Exception {
    public InvalidPatientAgeException(String message) {
        super(message);
    }
}

// Q12. Hospital patient age validation
public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter patient name: ");
        String name = sc.nextLine();
        System.out.print("Enter patient age: ");
        String ageInput = sc.nextLine();
        try {
            int age = Integer.parseInt(ageInput);
            if (age < 0 || age > 120) {
                throw new InvalidPatientAgeException("Age " + age + " is invalid. Valid age range is 0 to 120");
            }
            System.out.println("Patient registered successfully: " + name + ", Age " + age);
        } catch (NumberFormatException e) {
            System.out.println("Error: Age must be a number");
        } catch (InvalidPatientAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
