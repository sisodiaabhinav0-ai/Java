import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// Q3. Count lines, words and characters in data.txt
public class Q03 {
    public static void main(String[] args) {
        File file = new File("data.txt");
        try {
            // create data.txt with multiple lines if it does not exist yet
            if (!file.exists()) {
                try (FileWriter writer = new FileWriter(file)) {
                    writer.write("Java is a popular programming language." + System.lineSeparator());
                    writer.write("File handling is an important topic." + System.lineSeparator());
                    writer.write("This file has multiple lines of text." + System.lineSeparator());
                }
                System.out.println("data.txt created with sample text");
            }

            int lines = 0, words = 0, characters = 0;
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    lines++;
                    characters += line.length();
                    String trimmed = line.trim();
                    if (!trimmed.isEmpty()) {
                        words += trimmed.split("\\s+").length;
                    }
                }
            }
            System.out.println("Number of lines      = " + lines);
            System.out.println("Number of words      = " + words);
            System.out.println("Number of characters = " + characters);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
