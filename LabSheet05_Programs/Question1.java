/* Standalone Java solution for Question 1: Student Encapsulation */
public class Question1 {
    static class Student1 {
            private String name;
            private int rollNo;
            private double marks;
    
            public String getName() { return name; }
            public void setName(String name) { this.name = name; }
            public int getRollNo() { return rollNo; }
            public void setRollNo(int rollNo) { this.rollNo = rollNo; }
            public double getMarks() { return marks; }
            public void setMarks(double marks) { this.marks = marks; }
    
            public void displayDetails() {
                System.out.println("Name: " + getName());
                System.out.println("Roll No: " + getRollNo());
                System.out.println("Marks: " + getMarks());
            }
        }

    public static void main(String[] args) {
                System.out.println("\\n=== Question 1: Student Encapsulation ===");
                Student1 s = new Student1();
                s.setName("Aman");
                s.setRollNo(101);
                s.setMarks(88.5);
                s.displayDetails();
            
    }
}
