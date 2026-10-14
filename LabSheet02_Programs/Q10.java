import java.util.Scanner;

// Q10. Leap year within a given range
public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter range (start end): ");
        int start = sc.nextInt(), end = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        boolean leap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        boolean inRange = year >= start && year <= end;
        if (leap && inRange)
            System.out.println(year + " is a leap year and lies within the range");
        else if (leap)
            System.out.println(year + " is a leap year but NOT within the range");
        else if (inRange)
            System.out.println(year + " is within the range but NOT a leap year");
        else
            System.out.println(year + " is neither a leap year nor within the range");

        sc.close();
    }
}
