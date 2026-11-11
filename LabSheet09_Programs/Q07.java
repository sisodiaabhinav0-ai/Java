import java.util.ArrayList;
import java.util.Collections;

// Q7. Collections utility methods: sort, reverse, max, min, frequency
public class Q07 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(45);
        list.add(12);
        list.add(78);
        list.add(12);
        list.add(33);
        list.add(90);
        list.add(12);
        System.out.println("Original list : " + list);

        Collections.sort(list);
        System.out.println("After sort()  : " + list);

        Collections.reverse(list);
        System.out.println("After reverse(): " + list);

        System.out.println("Maximum       : " + Collections.max(list));
        System.out.println("Minimum       : " + Collections.min(list));
        System.out.println("Frequency of 12 : " + Collections.frequency(list, 12));
    }
}
