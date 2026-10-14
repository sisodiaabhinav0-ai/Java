import java.util.Scanner;

// Q14. Character classification: digit, uppercase, lowercase, special
public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        if (Character.isDigit(ch))
            System.out.println("'" + ch + "' is a Digit");
        else if (Character.isUpperCase(ch))
            System.out.println("'" + ch + "' is an Uppercase letter");
        else if (Character.isLowerCase(ch))
            System.out.println("'" + ch + "' is a Lowercase letter");
        else
            System.out.println("'" + ch + "' is a Special character");

        sc.close();
    }
}
