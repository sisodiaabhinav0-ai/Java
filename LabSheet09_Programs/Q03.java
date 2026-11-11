import java.util.ArrayList;

// Q3. Replace second student with set() and remove the fourth student
public class Q03 {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Amit");
        students.add("Neha");
        students.add("Ravi");
        students.add("Priya");
        students.add("Karan");
        System.out.println("Original list           : " + students);

        students.set(1, "Rohit");     // second student (index 1)
        System.out.println("After set(1, \"Rohit\")   : " + students);

        students.remove(3);           // fourth student (index 3)
        System.out.println("After remove(3)         : " + students);
    }
}
