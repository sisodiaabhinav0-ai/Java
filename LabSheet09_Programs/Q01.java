import java.util.ArrayList;

// Q1. Student list using ArrayList<String>
public class Q01 {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Amit");
        students.add("Neha");
        students.add("Ravi");
        students.add("Priya");
        students.add("Karan");
        students.add("Sneha");
        students.add("Rohit");
        students.add("Anjali");
        students.add("Vikas");
        students.add("Pooja");

        System.out.println("Student names:");
        for (String name : students) {
            System.out.println(name);
        }
        System.out.println("Total size = " + students.size());
    }
}
