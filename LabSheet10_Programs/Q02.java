import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// Q2. Read student.txt and display its contents
// Run Q01 first, so that student.txt exists in the same folder.
public class Q02 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("student.txt"))) {
            System.out.println("Contents of student.txt:");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: student.txt does not exist. Please run Q01 first.");
        } catch (IOException e) {
            System.out.println("Error while reading the file: " + e.getMessage());
        }
    }
}
