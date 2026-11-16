import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// Q9. Store 5 student records in student_records.txt and display them
public class Q09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Part 1: accept and store details of 5 students
        try (FileWriter writer = new FileWriter("student_records.txt")) {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Enter details of student " + i + ":");
                System.out.print("Roll Number: ");
                String roll = sc.nextLine();
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Course: ");
                String course = sc.nextLine();
                System.out.print("Marks: ");
                String marks = sc.nextLine();
                writer.write(roll + "," + name + "," + course + "," + marks + System.lineSeparator());
            }
            System.out.println("\nAll records stored in student_records.txt");
        } catch (IOException e) {
            System.out.println("Error while writing: " + e.getMessage());
        }

        // Part 2: read the file and display all records
        try (BufferedReader reader = new BufferedReader(new FileReader("student_records.txt"))) {
            System.out.println("\n---- Student Records ----");
            System.out.printf("%-10s %-15s %-12s %-8s%n", "Roll No", "Name", "Course", "Marks");
            String line;
            while ((line = reader.readLine()) != null) {
                String[] p = line.split(",");
                if (p.length == 4) {
                    System.out.printf("%-10s %-15s %-12s %-8s%n", p[0], p[1], p[2], p[3]);
                }
            }
        } catch (IOException e) {
            System.out.println("Error while reading: " + e.getMessage());
        }
        sc.close();
    }
}
