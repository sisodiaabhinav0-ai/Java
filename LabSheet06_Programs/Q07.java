import java.util.Scanner;

// Q7. Using throws
public class Q07 {
    // checkAge() declares the exception using throws
    static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age is less than 18, not eligible");
        }
        System.out.println("Age is " + age + ", eligible");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        try {
            checkAge(age);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
