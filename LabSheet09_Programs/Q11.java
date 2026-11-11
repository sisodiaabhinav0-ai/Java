import java.util.TreeSet;

// Q11. Sorted student IDs using TreeSet: first, last, higher, lower
public class Q11 {
    public static void main(String[] args) {
        TreeSet<Integer> ids = new TreeSet<>();
        int[] input = {105, 101, 103, 102, 105, 104, 101};

        System.out.print("Input IDs (with duplicates): ");
        for (int id : input) {
            System.out.print(id + " ");
            ids.add(id);
        }
        System.out.println();

        System.out.println("Unique sorted IDs : " + ids);
        System.out.println("first()           : " + ids.first());
        System.out.println("last()            : " + ids.last());
        System.out.println("higher(103)       : " + ids.higher(103));   // smallest ID greater than 103
        System.out.println("lower(103)        : " + ids.lower(103));    // largest ID less than 103
    }
}
