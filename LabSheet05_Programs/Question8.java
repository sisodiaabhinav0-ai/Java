/* Standalone Java solution for Question 8: Person Employee Manager */
public class Question8 {
    static class Person8 {
            String name;
            void displayName() { System.out.println("Name: " + name); }
        }
    static class Employee8 extends Person8 {
            int employeeId;
            void displayEmployee() { displayName(); System.out.println("Employee ID: " + employeeId); }
        }
    static class Manager8 extends Employee8 {
            String department;
            void displayManager() {
                displayEmployee();
                System.out.println("Department: " + department);
            }
        }

    public static void main(String[] args) {
                System.out.println("\\n=== Question 8: Person Employee Manager ===");
                Manager8 m = new Manager8();
                m.name = "Meera"; m.employeeId = 202; m.department = "Finance";
                m.displayManager();
            
    }
}
