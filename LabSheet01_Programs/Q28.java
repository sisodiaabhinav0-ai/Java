import java.util.Scanner;

// Q28. Number of digits in a number
public class Q28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = Math.abs(sc.nextInt());
        int digits;
        if (n < 10) digits = 1;
        else if (n < 100) digits = 2;
        else if (n < 1000) digits = 3;
        else if (n < 10000) digits = 4;
        else if (n < 100000) digits = 5;
        else if (n < 1000000) digits = 6;
        else if (n < 10000000) digits = 7;
        else if (n < 100000000) digits = 8;
        else if (n < 1000000000) digits = 9;
        else digits = 10;
        System.out.println("Number of digits = " + digits);

        sc.close();
    }
}
