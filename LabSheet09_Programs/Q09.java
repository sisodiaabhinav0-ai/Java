import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

// Q9. ListIterator: set() and add() during iteration
public class Q09 {
    public static void main(String[] args) {
        List<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("Go");
        System.out.println("Original list : " + languages);

        ListIterator<String> it = languages.listIterator();
        while (it.hasNext()) {
            String lang = it.next();
            if (lang.equals("Python")) {
                it.set("JavaScript");     // replace current element
            }
            if (lang.equals("C++")) {
                it.add("Rust");           // insert after current element
            }
        }
        System.out.println("Modified list : " + languages);
    }
}
