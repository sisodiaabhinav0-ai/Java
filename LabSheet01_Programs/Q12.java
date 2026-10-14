import java.util.Scanner;

// Q12. Leap year check
public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        if (year % 400 == 0)
            System.out.println(year + " is a Leap Year");
        else if (year % 100 == 0)
            System.out.println(year + " is NOT a Leap Year");
        else if (year % 4 == 0)
            System.out.println(year + " is a Leap Year");
        else
            System.out.println(year + " is NOT a Leap Year");

        sc.close();
    }
}
