// Q3. Generic Student<T> where T is the student ID
public class Q03 {
    static class Student<T> {
        private T id;

        Student(T id) {
            this.id = id;
        }

        T getId() {
            return id;
        }
    }

    public static void main(String[] args) {
        Student<Integer> s = new Student<>(101);
        System.out.println("Student ID = " + s.getId());
    }
}
