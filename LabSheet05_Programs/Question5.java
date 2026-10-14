/* Standalone Java solution for Question 5: Person to Student */
public class Question5 {
    static class Person5 {
            String name;
            int age;
            void displayPerson() { System.out.println("Name: " + name + ", Age: " + age); }
        }
    static class Student5 extends Person5 {
            int rollNo;
            String course;
            void displayStudent() {
                displayPerson();
                System.out.println("Roll No: " + rollNo + ", Course: " + course);
            }
        }

    public static void main(String[] args) {
                System.out.println("\\n=== Question 5: Person to Student ===");
                Student5 s = new Student5();
                s.name = "Karan"; s.age = 20; s.rollNo = 12; s.course = "BCA";
                s.displayStudent();
            
    }
}
