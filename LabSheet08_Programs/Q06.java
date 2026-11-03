// Q6. Generic Employee<T, U> with display() method
public class Q06 {
    static class Employee<T, U> {
        private T id;
        private U name;

        Employee(T id, U name) {
            this.id = id;
            this.name = name;
        }

        void display() {
            System.out.println("Employee ID: " + id + " | Employee Name: " + name);
        }
    }

    public static void main(String[] args) {
        Employee<Integer, String> e1 = new Employee<>(1, "Amit");
        Employee<String, String> e2 = new Employee<>("E-02", "Neha");

        e1.display();
        e2.display();
    }
}
