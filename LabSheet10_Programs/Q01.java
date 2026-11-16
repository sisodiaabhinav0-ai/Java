import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// Q1. Create student.txt and write student details
public class Q01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter roll number: ");
        String roll = sc.nextLine();
        System.out.print("Enter course: ");
        String course = sc.nextLine();
        System.out.print("Enter semester: ");
        String semester = sc.nextLine();

        File file = new File("student.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists, old content will be replaced");
            }

            try (FileWriter writer = new FileWriter(file)) {
                writer.write("Student Name: " + name + System.lineSeparator());
                writer.write("Roll Number: " + roll + System.lineSeparator());
                writer.write("Course: " + course + System.lineSeparator());
                writer.write("Semester: " + semester + System.lineSeparator());
            }
            System.out.println("Data written successfully to student.txt");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
