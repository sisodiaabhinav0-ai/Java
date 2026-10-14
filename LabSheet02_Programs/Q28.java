import java.util.Scanner;

// Q28. Print 1 to 50 skipping perfect squares using continue
public class Q28 {
    public static void main(String[] args) {
        System.out.println("Numbers from 1 to 50 (perfect squares skipped):");
        for (int i = 1; i <= 50; i++) {
            int root = (int) Math.sqrt(i);
            if (root * root == i) continue;   // skip perfect squares
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
