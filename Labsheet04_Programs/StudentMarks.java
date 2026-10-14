public class StudentMarks {
    int marks1, marks2, marks3;
    static String universityName = "ABC University";

    StudentMarks(int a, int b, int c) {
        marks1 = a;
        marks2 = b;
        marks3 = c;
    }

    void calculateAverage() {
        double total = marks1 + marks2 + marks3;
        double average = total / 3;

        System.out.println("University: " + universityName);
        System.out.println("Total marks: " + total);
        System.out.println("Average: " + average);
    }

    public static void main(String[] args) {
        StudentMarks s = new StudentMarks(80, 75, 90);
        s.calculateAverage();
    }
}
