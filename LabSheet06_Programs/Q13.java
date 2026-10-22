import java.util.Scanner;

class InvalidDosageException extends Exception {
    public InvalidDosageException(String message) {
        super(message);
    }
}

// Q13. Pharmaceutical drug dosage validation
public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter patient name: ");
        String patient = sc.nextLine();
        System.out.print("Enter drug name: ");
        String drug = sc.nextLine();
        System.out.print("Enter dosage in mg: ");
        String dosageInput = sc.nextLine();
        try {
            double dosage = Double.parseDouble(dosageInput);
            if (dosage <= 0 || dosage > 1000) {
                throw new InvalidDosageException("Dosage " + dosage + " mg is invalid. Valid range is 1 mg to 1000 mg");
            }
            System.out.println("Dosage of " + dosage + " mg of " + drug + " is valid for " + patient);
        } catch (NumberFormatException e) {
            System.out.println("Error: Dosage must be a number");
        } catch (InvalidDosageException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Dosage validation completed.");
        }

        sc.close();
    }
}
