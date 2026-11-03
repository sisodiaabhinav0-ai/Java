// Q13. Generic Student<T, U, V> with ID, Name and Marks
public class Q13 {
    static class Student<T, U, V> {
        private T id;
        private U name;
        private V marks;

        Student(T id, U name, V marks) {
            this.id = id;
            this.name = name;
            this.marks = marks;
        }

        void display() {
            System.out.println("ID: " + id + " | Name: " + name + " | Marks: " + marks);
        }
    }

    public static void main(String[] args) {
        Student<Integer, String, Double> s1 = new Student<>(101, "Amit", 88.5);
        Student<String, String, Integer> s2 = new Student<>("S102", "Neha", 92);
        Student<Integer, String, Double> s3 = new Student<>(103, "Ravi", 76.25);

        s1.display();
        s2.display();
        s3.display();
    }
}
