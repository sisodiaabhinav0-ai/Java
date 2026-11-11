import java.util.ArrayList;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.TreeSet;

// Q15. Mini student collection management system
public class Q15 {
    static class Student {
        int id;
        String name;

        Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public String toString() {
            return "ID: " + id + " | Name: " + name;
        }
    }

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Student> students = new ArrayList<>();   // List: insertion order, student records
    static HashSet<Integer> ids = new HashSet<>();            // Set: unique IDs, no guaranteed order
    static TreeSet<Integer> sortedIds = new TreeSet<>();      // SortedSet: unique IDs, sorted

    static int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number");
            }
        }
    }

    static void addStudent() {
        int id = readInt("Enter student ID: ");
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        if (ids.add(id)) {                 // add() returns false if the ID already exists
            students.add(new Student(id, name));
            sortedIds.add(id);
            System.out.println("Student added");
        } else {
            System.out.println("Student ID " + id + " already exists, not added");
        }
    }

    static void removeStudent() {
        int id = readInt("Enter student ID to remove: ");
        if (ids.remove(id)) {
            students.removeIf(s -> s.id == id);
            sortedIds.remove(id);
            System.out.println("Student removed");
        } else {
            System.out.println("No student with ID " + id);
        }
    }

    static void searchStudent() {
        int id = readInt("Enter student ID to search: ");
        if (ids.contains(id)) {
            for (Student s : students) {
                if (s.id == id) {
                    System.out.println("Found: " + s);
                }
            }
        } else {
            System.out.println("No student with ID " + id);
        }
    }

    static void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display");
            return;
        }
        System.out.println("Students (ArrayList, insertion order):");
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println("Unique IDs (HashSet, no fixed order) : " + ids);
        System.out.println("Sorted IDs (TreeSet, sorted order)   : " + sortedIds);
    }

    static void iterateStudents() {
        ListIterator<Student> it = students.listIterator();
        System.out.println("Forward traversal:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("Backward traversal:");
        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }
    }

    static void showDifference() {
        System.out.println("List (ArrayList)    : keeps insertion order and allows duplicates");
        System.out.println("Set (HashSet)       : stores only unique values, order is not guaranteed");
        System.out.println("SortedSet (TreeSet) : stores only unique values in sorted order");
        System.out.println("Current ArrayList records  : " + students);
        System.out.println("Current HashSet IDs        : " + ids);
        System.out.println("Current TreeSet IDs        : " + sortedIds);
    }

    public static void main(String[] args) {
        // some starting data
        students.add(new Student(103, "Ravi"));
        students.add(new Student(101, "Amit"));
        students.add(new Student(102, "Neha"));
        for (Student s : students) {
            ids.add(s.id);
            sortedIds.add(s.id);
        }

        int choice;
        do {
            System.out.println("\n===== Student Collection Management =====");
            System.out.println("1. Add student");
            System.out.println("2. Remove student");
            System.out.println("3. Search student");
            System.out.println("4. Display students");
            System.out.println("5. Count students");
            System.out.println("6. Iterate (forward and backward)");
            System.out.println("7. Show List vs Set vs SortedSet");
            System.out.println("0. Exit");
            choice = readInt("Enter your choice: ");
            switch (choice) {
                case 1: addStudent(); break;
                case 2: removeStudent(); break;
                case 3: searchStudent(); break;
                case 4: displayStudents(); break;
                case 5: System.out.println("Total students = " + students.size()); break;
                case 6: iterateStudents(); break;
                case 7: showDifference(); break;
                case 0: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice");
            }
        } while (choice != 0);

        sc.close();
    }
}
