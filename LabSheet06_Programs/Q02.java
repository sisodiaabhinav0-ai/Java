import java.util.Scanner;

// Q2. Handling ArrayIndexOutOfBoundsException
public class Q02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};
        System.out.print("Enter array index: ");
        int index = sc.nextInt();
        try {
            System.out.println("Element at index " + index + " = " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index! Enter an index between 0 and 4");
        }

        sc.close();
    }
}
