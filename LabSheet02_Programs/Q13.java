import java.util.Scanner;

// Q13. Vowel / consonant / digit / special symbol using ternary
public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        String type = (ch >= '0' && ch <= '9') ? "Digit"
                : ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
                    ? ((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                        || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') ? "Vowel" : "Consonant")
                    : "Special symbol";
        System.out.println("'" + ch + "' is a " + type);

        sc.close();
    }
}
