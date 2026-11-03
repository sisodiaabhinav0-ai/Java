import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

// Q15. Mini generic student management program
public class Q15 {
    // Generic class with three type parameters: T = ID, U = Name, V = Marks
    static class Student<T, U, V> {
        private T id;
        private U name;
        private V marks;

        Student(T id, U name, V marks) {
            this.id = id;
            this.name = name;
            this.marks = marks;
        }

        T getId() {
            return id;
        }

        void display() {
            System.out.println("ID: " + id + " | Name: " + name + " | Marks: " + marks);
        }

        // needed so that contains() can compare two Student objects
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Student)) return false;
            Student<?, ?, ?> other = (Student<?, ?, ?>) o;
            return Objects.equals(id, other.id)
                    && Objects.equals(name, other.name)
                    && Objects.equals(marks, other.marks);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name, marks);
        }
    }

    static void displayAll(ArrayList<Student<Integer, String, Double>> list) {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).display();
        }
    }

    static Student<Integer, String, Double> searchById(ArrayList<Student<Integer, String, Double>> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            Student<Integer, String, Double> s = list.get(i);
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student<Integer, String, Double>> students = new ArrayList<>();

        students.add(new Student<>(101, "Amit", 88.5));
        students.add(new Student<>(102, "Neha", 92.0));
        students.add(new Student<>(103, "Ravi", 76.25));
        students.add(new Student<>(104, "Priya", 81.0));
        students.add(new Student<>(105, "Karan", 69.5));

        System.out.println("---- All Students ----");
        displayAll(students);
        System.out.println("Total number of students = " + students.size());

        System.out.print("\nEnter student ID to search: ");
        int id = sc.nextInt();
        Student<Integer, String, Double> found = searchById(students, id);
        if (found != null) {
            System.out.println("Student found:");
            found.display();
        } else {
            System.out.println("No student found with ID " + id);
        }

        // contains() works because equals() is overridden in Student
        Student<Integer, String, Double> check = new Student<Integer, String, Double>(103, "Ravi", 76.25);
        System.out.println("\nList contains Ravi (103)? " + students.contains(check));

        // Type safety: the list accepts only Student<Integer, String, Double>
        // students.add("Hello");    // compile-time error, a String cannot be added
        // students.add(new Student<String, String, Double>("S1", "Test", 50.0));    // compile-time error
        System.out.println("Type safety: wrong types are rejected by the compiler (see commented lines in code)");

        sc.close();
    }
}
