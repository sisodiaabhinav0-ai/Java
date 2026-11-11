import java.util.ArrayList;
import java.util.Scanner;

// Q6. Search a course in ArrayList<String> using contains()
public class Q06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> courses = new ArrayList<>();
        courses.add("Java");
        courses.add("Python");
        courses.add("DBMS");
        courses.add("Operating System");
        courses.add("Computer Networks");
        courses.add("Data Structures");
        System.out.println("Available courses: " + courses);

        System.out.print("Enter a course to search: ");
        String course = sc.nextLine();
        if (courses.contains(course))
            System.out.println("Course \"" + course + "\" exists");
        else
            System.out.println("Course \"" + course + "\" does not exist");

        sc.close();
    }
}
