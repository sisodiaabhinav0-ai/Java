import java.util.TreeSet;

// Q5. Sorted roll numbers using TreeSet<Integer>
public class Q05 {
    public static void main(String[] args) {
        TreeSet<Integer> rollNumbers = new TreeSet<>();
        int[] input = {45, 12, 78, 33, 90, 21, 67, 5, 54, 38};

        System.out.print("Roll numbers in random order: ");
        for (int r : input) {
            System.out.print(r + " ");
            rollNumbers.add(r);
        }
        System.out.println();

        System.out.println("Roll numbers in sorted order: " + rollNumbers);
    }
}
