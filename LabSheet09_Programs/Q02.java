import java.util.ArrayList;

// Q2. Marks list: first, last and middle elements using get()
public class Q02 {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(78);
        marks.add(85);
        marks.add(92);
        marks.add(67);
        marks.add(88);

        System.out.println("Marks list     : " + marks);
        System.out.println("First element  : " + marks.get(0));
        System.out.println("Middle element : " + marks.get(marks.size() / 2));
        System.out.println("Last element   : " + marks.get(marks.size() - 1));
    }
}
