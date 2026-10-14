import java.util.Scanner;

// Q26. Compare first and last digit of a five-digit number
public class Q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a five-digit number: ");
        int n = sc.nextInt();
        if (n >= 10000 && n <= 99999) {
            int first = n / 10000;
            int last = n % 10;
            System.out.println("First digit = " + first + ", Last digit = " + last);
            if (first == last)
                System.out.println("First and last digits are the same");
            else
                System.out.println("First and last digits are different");
        } else {
            System.out.println("Please enter a valid five-digit number");
        }

        sc.close();
    }
}
