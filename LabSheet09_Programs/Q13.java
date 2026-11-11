import java.util.ArrayList;
import java.util.ListIterator;

// Q13. ListIterator forward/backward with nextIndex() and previousIndex()
public class Q13 {
    public static void main(String[] args) {
        ArrayList<String> courses = new ArrayList<>();
        courses.add("Java");
        courses.add("Python");
        courses.add("DBMS");
        courses.add("Operating System");
        courses.add("Networks");

        ListIterator<String> it = courses.listIterator();

        System.out.println("Forward traversal:");
        while (it.hasNext()) {
            int index = it.nextIndex();
            String course = it.next();
            System.out.println("nextIndex() = " + index + " -> " + course);
        }

        System.out.println("\nBackward traversal:");
        while (it.hasPrevious()) {
            int index = it.previousIndex();
            String course = it.previous();
            System.out.println("previousIndex() = " + index + " -> " + course);
        }
    }
}
