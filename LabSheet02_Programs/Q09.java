import java.util.Scanner;

// Q9. Compare two strings lexicographically without built-in compare
public class Q09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        int len = (s1.length() < s2.length()) ? s1.length() : s2.length();
        int result = 0;   // -1 : s1 comes first, 1 : s2 comes first, 0 : equal
        for (int i = 0; i < len; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if (c1 < c2) {
                result = -1;
                break;
            } else if (c1 > c2) {
                result = 1;
                break;
            }
        }
        // all common characters same, then shorter string comes first
        if (result == 0) {
            if (s1.length() < s2.length()) result = -1;
            else if (s1.length() > s2.length()) result = 1;
        }

        if (result < 0)
            System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\" in lexicographic order");
        else if (result > 0)
            System.out.println("\"" + s2 + "\" comes before \"" + s1 + "\" in lexicographic order");
        else
            System.out.println("Both strings are equal");

        sc.close();
    }
}
