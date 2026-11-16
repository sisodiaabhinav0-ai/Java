import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// Q8. Count vowels, consonants, digits and spaces in input.txt
public class Q08 {
    public static void main(String[] args) {
        File file = new File("input.txt");
        try {
            // create input.txt with sample text if it does not exist yet
            if (!file.exists()) {
                try (FileWriter writer = new FileWriter(file)) {
                    writer.write("Java 21 is the latest LTS version." + System.lineSeparator());
                    writer.write("File handling in Java uses 2 types of streams." + System.lineSeparator());
                }
                System.out.println("input.txt created with sample text");
            }

            int vowels = 0, consonants = 0, digits = 0, spaces = 0;
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                int ch;
                while ((ch = reader.read()) != -1) {     // analyse every character
                    char c = (char) ch;
                    if (Character.isLetter(c)) {
                        char lower = Character.toLowerCase(c);
                        if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u')
                            vowels++;
                        else
                            consonants++;
                    } else if (Character.isDigit(c)) {
                        digits++;
                    } else if (c == ' ') {
                        spaces++;
                    }
                }
            }
            System.out.println("Vowels     = " + vowels);
            System.out.println("Consonants = " + consonants);
            System.out.println("Digits     = " + digits);
            System.out.println("Spaces     = " + spaces);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
