import java.util.Random;

// Q29. Random numbers until divisible by 7 and 13 using break
public class Q29 {
    public static void main(String[] args) {
        Random rand = new Random();
        int attempts = 0;
        while (true) {
            int num = rand.nextInt(100) + 1;   // random number from 1 to 100
            attempts++;
            System.out.println("Generated: " + num);
            if (num % 7 == 0 && num % 13 == 0) {
                System.out.println("Found " + num + " divisible by both 7 and 13 after " + attempts + " attempts");
                break;
            }
        }
    }
}
