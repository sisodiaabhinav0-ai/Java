import java.util.ArrayList;
import java.util.HashSet;

// Q12. Hospital patient list using ArrayList and HashSet
public class Q12 {
    public static void main(String[] args) {
        ArrayList<String> patientNames = new ArrayList<>();
        HashSet<String> patientIds = new HashSet<>();

        // Add
        patientNames.add("Amit");
        patientNames.add("Neha");
        patientNames.add("Ravi");
        patientIds.add("P101");
        patientIds.add("P102");
        patientIds.add("P103");
        System.out.println("Patient names : " + patientNames);
        System.out.println("Patient IDs   : " + patientIds);

        System.out.println("Adding duplicate ID P102 -> added = " + patientIds.add("P102"));

        // Remove
        patientNames.remove("Neha");
        patientIds.remove("P102");
        System.out.println("\nAfter removing Neha and P102:");
        System.out.println("Patient names : " + patientNames);
        System.out.println("Patient IDs   : " + patientIds);

        // Search
        System.out.println("\nSearch name Ravi  : " + patientNames.contains("Ravi"));
        System.out.println("Search name Neha  : " + patientNames.contains("Neha"));
        System.out.println("Search ID P103    : " + patientIds.contains("P103"));
        System.out.println("Search ID P999    : " + patientIds.contains("P999"));

        // Display
        System.out.println("\nFinal records:");
        for (String name : patientNames) {
            System.out.println("Patient: " + name);
        }
        for (String id : patientIds) {
            System.out.println("Patient ID: " + id);
        }
        System.out.println("Total patients = " + patientNames.size() + ", unique IDs = " + patientIds.size());
    }
}
