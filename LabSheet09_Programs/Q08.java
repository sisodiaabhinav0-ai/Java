import java.util.LinkedList;

// Q8. LinkedList student queue: addFirst, addLast, removeFirst, removeLast
public class Q08 {
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();
        queue.add("Amit");
        queue.add("Neha");
        queue.add("Ravi");
        System.out.println("Students waiting       : " + queue);

        queue.addFirst("Priya");
        System.out.println("After addFirst(Priya)  : " + queue);

        queue.addLast("Karan");
        System.out.println("After addLast(Karan)   : " + queue);

        String first = queue.removeFirst();
        System.out.println("removeFirst() removed  : " + first + "  -> " + queue);

        String last = queue.removeLast();
        System.out.println("removeLast() removed   : " + last + "  -> " + queue);
    }
}
