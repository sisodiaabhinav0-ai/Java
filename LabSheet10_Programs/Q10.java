import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// Q10. File-based employee management (store and search by ID)
public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File file = new File("employees.txt");

        // Part 1: create the file and store employee records
        try {
            if (file.createNewFile()) {
                System.out.println("employees.txt created");
            }
        } catch (IOException e) {
            System.out.println("Error creating file: " + e.getMessage());
        }

        System.out.print("How many employees do you want to add? ");
        int n = Integer.parseInt(sc.nextLine().trim());
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter details of employee " + i + ":");
            System.out.print("Employee ID: ");
            String id = sc.nextLine().trim();
            System.out.print("Employee Name: ");
            String name = sc.nextLine();
            System.out.print("Department: ");
            String dept = sc.nextLine();
            System.out.print("Salary: ");
            String salary = sc.nextLine();

            // append mode, so earlier employees are not deleted
            try (FileWriter writer = new FileWriter(file, true)) {
                writer.write(id + "," + name + "," + dept + "," + salary + System.lineSeparator());
            } catch (IOException e) {
                System.out.println("Error while writing: " + e.getMessage());
            }
        }

        // Part 2: read the file and search by Employee ID
        System.out.print("\nEnter Employee ID to search: ");
        String searchId = sc.nextLine().trim();
        boolean found = false;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] p = line.split(",");
                if (p.length == 4 && p[0].trim().equals(searchId)) {
                    System.out.println("Employee record found:");
                    System.out.println("Employee ID : " + p[0]);
                    System.out.println("Name        : " + p[1]);
                    System.out.println("Department  : " + p[2]);
                    System.out.println("Salary      : " + p[3]);
                    found = true;
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: employees.txt does not exist");
            sc.close();
            return;
        } catch (IOException e) {
            System.out.println("Error while reading: " + e.getMessage());
        }

        if (!found) {
            System.out.println("Employee record not found.");
        }
        sc.close();
    }
}
