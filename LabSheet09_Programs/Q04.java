import java.util.HashSet;

// Q4. Unique departments using HashSet<String>
public class Q04 {
    public static void main(String[] args) {
        HashSet<String> departments = new HashSet<>();
        String[] input = {"CSE", "ECE", "ME", "CSE", "CE", "ECE", "IT", "ME"};

        System.out.println("Input departments (with duplicates):");
        for (String d : input) {
            boolean added = departments.add(d);
            System.out.println(d + " -> added = " + added);
        }

        System.out.println("Unique departments: " + departments);
        System.out.println("Total unique departments = " + departments.size());
    }
}
