import java.util.Scanner;

// Q25. Average marks of students in a 2D array using for-each
public class Q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        System.out.print("Enter number of subjects: ");
        int m = sc.nextInt();
        int[][] marks = new int[n][m];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks of student " + (i + 1) + ":");
            for (int j = 0; j < m; j++) marks[i][j] = sc.nextInt();
        }
        int student = 1;
        double classTotal = 0;
        for (int[] row : marks) {
            int sum = 0;
            for (int mark : row) sum += mark;
            double avg = (double) sum / row.length;
            System.out.printf("Average marks of student %d = %.2f%n", student, avg);
            classTotal += avg;
            student++;
        }
        System.out.printf("Class average = %.2f%n", classTotal / n);

        sc.close();
    }
}
