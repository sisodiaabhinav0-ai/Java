import java.util.Scanner;

// Q20. Marks of students with different number of subjects (jagged array)
public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[][] marks = new int[n][];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number of subjects for student " + (i + 1) + ": ");
            int subjects = sc.nextInt();
            marks[i] = new int[subjects];
            System.out.println("Enter marks:");
            for (int j = 0; j < subjects; j++)
                marks[i][j] = sc.nextInt();
        }
        System.out.println("Marks of students:");
        for (int i = 0; i < n; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            for (int j = 0; j < marks[i].length; j++)
                System.out.print(marks[i][j] + " ");
            System.out.println();
        }

        sc.close();
    }
}
