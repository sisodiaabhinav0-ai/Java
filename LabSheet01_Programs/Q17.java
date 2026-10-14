import java.util.Scanner;

// Q17. Palindrome integer using arithmetic and type casting
public class Q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        int temp = num;
        long reverse = 0;
        while (temp > 0) {
            reverse = reverse * 10 + temp % 10;
            temp = temp / 10;
        }
        // type casting: int is cast to long before comparing
        if (num >= 0 && reverse == (long) num)
            System.out.println(num + " is a Palindrome");
        else
            System.out.println(num + " is NOT a Palindrome");

        sc.close();
    }
}
