/* Standalone Java solution for Question 3: Employee Salary Encapsulation */
public class Question3 {
    static class Employee3 {
            private int employeeId;
            private String employeeName;
            private double salary;
    
            public int getEmployeeId() { return employeeId; }
            public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }
            public String getEmployeeName() { return employeeName; }
            public void setEmployeeName(String employeeName) { this.employeeName = employeeName; }
            public double getSalary() { return salary; }
            public void setSalary(double salary) {
                if (salary < 0 || salary > 1_000_000) {
                    System.out.println("Invalid salary: must be between 0 and 1,000,000.");
                } else {
                    this.salary = salary;
                    System.out.println("Salary accepted: " + salary);
                }
            }
    
            public void displayDetails() {
                System.out.println("Employee ID: " + employeeId + ", Name: " + employeeName
                        + ", Salary: " + salary);
            }
        }

    public static void main(String[] args) {
                System.out.println("\\n=== Question 3: Employee Salary Encapsulation ===");
                Employee3 e = new Employee3();
                e.setEmployeeId(1);
                e.setEmployeeName("Neha");
                e.setSalary(55000);
                e.setSalary(-100);
                e.setSalary(1_500_000);
                e.displayDetails();
            
    }
}
