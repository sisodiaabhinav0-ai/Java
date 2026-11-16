import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// Q6. Search a word in notes.txt
public class Q06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File file = new File("notes.txt");
        try {
            // create notes.txt with sample text if it does not exist yet
            if (!file.exists()) {
                try (FileWriter writer = new FileWriter(file)) {
                    writer.write("Java is a programming language." + System.lineSeparator());
                    writer.write("Learning Java is fun, and Java is widely used." + System.lineSeparator());
                    writer.write("Python is another popular language." + System.lineSeparator());
                }
                System.out.println("notes.txt created with sample text");
            }

            System.out.print("Enter a word to search: ");
            String word = sc.nextLine().trim();

            int count = 0;
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    // quick check with contains(), then count exact word matches
                    if (line.toLowerCase().contains(word.toLowerCase())) {
                        String[] tokens = line.split("\\W+");
                        for (String token : tokens) {
                            if (token.equalsIgnoreCase(word)) {
                                count++;
                            }
                        }
                    }
                }
            }

            if (count > 0) {
                System.out.println("Word \"" + word + "\" is found, it occurs " + count + " time(s)");
            } else {
                System.out.println("Word \"" + word + "\" is not found in the file");
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
