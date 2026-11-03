import java.util.ArrayList;
import java.util.Scanner;

// Q11. Search a number in ArrayList<Integer> using contains()
public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int[] values = {5, 12, 18, 25, 33, 40, 47, 56, 64, 72};
        for (int v : values) {
            numbers.add(v);
        }
        System.out.println("List: " + numbers);

        System.out.print("Enter a number to search: ");
        int key = sc.nextInt();
        if (numbers.contains(key))
            System.out.println(key + " exists in the list");
        else
            System.out.println(key + " does not exist in the list");

        sc.close();
    }
}
