import java.util.Scanner;

// Q3. Handling NumberFormatException
public class Q03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String str = sc.nextLine();
        try {
            int num = Integer.parseInt(str);
            System.out.println("Converted integer = " + num);
        } catch (NumberFormatException e) {
            System.out.println("Error: \"" + str + "\" is not a valid integer");
        }

        sc.close();
    }
}
