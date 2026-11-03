import java.util.ArrayList;

// Q10. ArrayList<String> with add(), get(), set(), remove() and size()
public class Q10 {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Amit");
        students.add("Neha");
        students.add("Ravi");
        students.add("Priya");
        students.add("Karan");
        System.out.println("Initial list    : " + students);
        System.out.println("Size            : " + students.size());

        students.add("Sneha");
        System.out.println("After add()     : " + students);

        System.out.println("get(2)          : " + students.get(2));

        students.set(1, "Rohit");
        System.out.println("After set(1)    : " + students);

        students.remove(0);
        System.out.println("After remove(0) : " + students);

        System.out.println("Final size      : " + students.size());
    }
}
