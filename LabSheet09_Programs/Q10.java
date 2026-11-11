import java.util.ArrayList;
import java.util.HashSet;

// Q10. List vs Set: ArrayList and HashSet with the same input
public class Q10 {
    public static void main(String[] args) {
        int[] input = {50, 10, 80, 10, 30, 50, 90, 30};

        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int v : input) {
            list.add(v);
            set.add(v);
        }

        System.out.println("ArrayList : " + list);
        System.out.println("HashSet   : " + set);

        System.out.println();
        System.out.println("Difference:");
        System.out.println("1. Duplicates : ArrayList keeps duplicate values (size = " + list.size()
                + "), HashSet stores only unique values (size = " + set.size() + ").");
        System.out.println("2. Ordering   : ArrayList keeps insertion order, HashSet does not guarantee any order.");
    }
}
