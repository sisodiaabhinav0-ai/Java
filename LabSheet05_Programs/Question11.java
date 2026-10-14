/* Standalone Java solution for Question 11: Person Student and Teacher */
public class Question11 {
    static class Person11 {
            String name;
            void displayName() { System.out.println("Name: " + name); }
        }
    static class Student11 extends Person11 {
            String course;
            void study() { System.out.println(name + " studies " + course + "."); }
        }
    static class Teacher11 extends Person11 {
            String subject;
            void teach() { System.out.println(name + " teaches " + subject + "."); }
        }

    public static void main(String[] args) {
                System.out.println("\\n=== Question 11: Person Student and Teacher ===");
                Student11 s = new Student11(); s.name = "Isha"; s.course = "BCA";
                Teacher11 t = new Teacher11(); t.name = "Mr. Sharma"; t.subject = "Java";
                s.displayName(); s.study(); t.displayName(); t.teach();
            
    }
}
