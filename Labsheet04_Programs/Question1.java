public class Q1 {

    static class Student {
        String name;
        int age;
        static int count = 0;

        Student(String name, int age) {
            this.name = name;
            this.age = age;
            count++;
        }

        void display() {
            String n = name;
            int a = age;
            System.out.println("Name: " + n + ", Age: " + a);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Mukesh", 20);
        Student s2 = new Student("Rahul", 21);

        s1.display();
        s2.display();

        System.out.println("Total Students: " + Student.count);
    }
}