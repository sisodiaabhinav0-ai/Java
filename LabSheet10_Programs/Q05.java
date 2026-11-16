import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// Q5. Copy source.txt into backup.txt
public class Q05 {
    public static void main(String[] args) {
        File source = new File("source.txt");
        try {
            // create source.txt with sample text if it does not exist yet
            if (!source.exists()) {
                try (FileWriter writer = new FileWriter(source)) {
                    writer.write("This is the source file." + System.lineSeparator());
                    writer.write("Its contents will be copied into backup.txt." + System.lineSeparator());
                }
                System.out.println("source.txt created with sample text");
            }

            try (FileReader reader = new FileReader("source.txt");
                 FileWriter writer = new FileWriter("backup.txt")) {
                int ch;
                while ((ch = reader.read()) != -1) {     // character stream, one character at a time
                    writer.write(ch);
                }
            }
            System.out.println("File copied successfully from source.txt to backup.txt");
        } catch (IOException e) {
            System.out.println("Error while copying: " + e.getMessage());
        }
    }
}
