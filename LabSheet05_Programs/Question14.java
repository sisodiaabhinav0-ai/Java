/* Standalone Java solution for Question 14: Employee Salary Calculation */
public class Question14 {
    static class Employee14 {
            double calculateSalary() { return 40000; }
        }
    static class Manager14 extends Employee14 {
            @Override double calculateSalary() { return 60000 + 10000; }
        }

    public static void main(String[] args) {
                System.out.println("\\n=== Question 14: Employee Salary Calculation ===");
                Employee14 employee = new Employee14();
                Employee14 manager = new Manager14();
                System.out.println("Employee salary: " + employee.calculateSalary());
                System.out.println("Manager salary: " + manager.calculateSalary());
            
    }
}
