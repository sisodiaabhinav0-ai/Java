/* Standalone Java solution for Question 6: Employee Manager Encapsulation */
public class Question6 {
    static class Employee6 {
            private String name;
            private double salary;
            public String getName() { return name; }
            public void setName(String name) { this.name = name; }
            public double getSalary() { return salary; }
            public void setSalary(double salary) {
                if (salary >= 0) this.salary = salary;
                else System.out.println("Salary cannot be negative.");
            }
        }
    static class Manager6 extends Employee6 {
            private String department;
            public String getDepartment() { return department; }
            public void setDepartment(String department) { this.department = department; }
            void displayManager() {
                System.out.println("Name: " + getName() + ", Salary: " + getSalary()
                        + ", Department: " + department);
            }
        }

    public static void main(String[] args) {
                System.out.println("\\n=== Question 6: Employee Manager Encapsulation ===");
                Manager6 m = new Manager6();
                m.setName("Arjun"); m.setSalary(80000); m.setDepartment("IT");
                m.displayManager();
            
    }
}
