import java.util.Scanner;

// Q18. First 20 Fibonacci terms using for loop
public class Q18 {
    public static void main(String[] args) {
        long first = 0, second = 1;
        System.out.println("First 20 terms of Fibonacci sequence:");
        for (int i = 1; i <= 20; i++) {
            System.out.print(first + " ");
            long next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }
}
