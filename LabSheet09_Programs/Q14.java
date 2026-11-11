import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// Q14. ArrayList vs LinkedList lab with comparison table
public class Q14 {
    static final int N = 20000;
    static long sink;    // keeps the JVM from removing the loops

    // Part 1: basic operations on a list (same code works for both lists)
    static void basicOperations(String title, List<String> list) {
        System.out.println("---- " + title + " ----");
        list.add("Amit");
        list.add("Neha");
        list.add("Ravi");
        list.add(1, "Priya");                         // insertion at index
        System.out.println("After insertion : " + list);
        list.remove("Neha");                          // deletion
        System.out.println("After deletion  : " + list);
        System.out.println("get(1)          : " + list.get(1));
        System.out.println("size()          : " + list.size());
        System.out.print("Iteration       : ");
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println("\n");
    }

    // Part 2: time one operation on a list, in milliseconds
    static double time(List<Integer> list, int op) {
        long start = System.nanoTime();
        long sum = 0;
        switch (op) {
            case 0:                                   // add at end
                for (int i = 0; i < N; i++) list.add(i);
                break;
            case 1:                                   // get by index
                for (int i = 0; i < N; i++) sum += list.get(i);
                break;
            case 2:                                   // iteration
                for (int x : list) sum += x;
                break;
            case 3:                                   // delete from beginning
                while (!list.isEmpty()) list.remove(0);
                break;
            case 4:                                   // insert at beginning
                for (int i = 0; i < N; i++) list.add(0, i);
                break;
        }
        sink += sum;
        return (System.nanoTime() - start) / 1000000.0;
    }

    public static void main(String[] args) {
        basicOperations("ArrayList", new ArrayList<String>());
        basicOperations("LinkedList", new LinkedList<String>());

        String[] ops = {"Add at end", "get(index)", "Iteration", "Delete from beginning", "Insert at beginning"};
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        System.out.println("Comparison table for " + N + " elements (time in ms):");
        System.out.printf("%-25s %-14s %-14s%n", "Operation", "ArrayList", "LinkedList");
        // order of operations matters: the list is filled first, then emptied, then refilled
        int[] order = {0, 1, 2, 3, 4};
        for (int op : order) {
            double a = time(arrayList, op);
            double l = time(linkedList, op);
            System.out.printf("%-25s %-14.2f %-14.2f%n", ops[op], a, l);
        }

        System.out.println();
        System.out.println("Observations:");
        System.out.println("1. get(index) is fast in ArrayList (direct array access) and slow in LinkedList (node by node).");
        System.out.println("2. Insert/delete at the beginning is fast in LinkedList and slow in ArrayList (elements shift).");
        System.out.println("3. Adding at the end and iteration are fast in both.");
    }
}
