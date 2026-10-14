import java.util.Scanner;

// Q8. Vowel or consonant using if-else
public class Q08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        if (Character.isLetter(ch)) {
            char lower = Character.toLowerCase(ch);
            if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u')
                System.out.println("'" + ch + "' is a Vowel");
            else
                System.out.println("'" + ch + "' is a Consonant");
        } else {
            System.out.println("'" + ch + "' is not an alphabet");
        }

        sc.close();
    }
}
