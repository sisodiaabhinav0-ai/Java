import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// Q4. Append student information to students.txt
public class Q04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter roll number: ");
        String roll = sc.nextLine();
        System.out.print("Enter marks: ");
        String marks = sc.nextLine();

        // second argument true = append mode, old contents are not deleted
        try (FileWriter writer = new FileWriter("students.txt", true)) {
            writer.write("Name: " + name + ", Roll No: " + roll + ", Marks: " + marks + System.lineSeparator());
            System.out.println("Record appended successfully");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nCurrent contents of students.txt:");
        try (BufferedReader reader = new BufferedReader(new FileReader("students.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
