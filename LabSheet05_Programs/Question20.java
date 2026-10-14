/* Standalone Java solution for Question 20: University Employee System */
public class Question20 {
    static class Employee20 {
            private int employeeId;
            private String employeeName;
            private double salary;
    
            public int getEmployeeId() { return employeeId; }
            public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }
            public String getEmployeeName() { return employeeName; }
            public void setEmployeeName(String employeeName) { this.employeeName = employeeName; }
            public double getSalary() { return salary; }
            public void setSalary(double salary) {
                if (salary >= 0) this.salary = salary;
                else System.out.println("Salary cannot be negative.");
            }
            void displayDetails() {
                System.out.println("ID: " + employeeId + ", Name: " + employeeName + ", Salary: " + salary);
            }
            double calculateSalary() { return salary; }
        }
    interface Researcher20 { void conductResearch(); }
    static class Teacher20 extends Employee20 implements Researcher20 {
            private String subject;
            public String getSubject() { return subject; }
            public void setSubject(String subject) { this.subject = subject; }
            void teach() { System.out.println(getEmployeeName() + " teaches " + subject + "."); }
            @Override double calculateSalary() { return super.calculateSalary() + 5000; }
            @Override public void conductResearch() {
                System.out.println(getEmployeeName() + " conducts research.");
            }
        }
    static class VisitingTeacher20 extends Teacher20 {
            private int hoursWorked;
            public int getHoursWorked() { return hoursWorked; }
            public void setHoursWorked(int hoursWorked) {
                if (hoursWorked >= 0) this.hoursWorked = hoursWorked;
                else System.out.println("Hours worked cannot be negative.");
            }
            @Override double calculateSalary() { return getHoursWorked() * 500.0; }
        }
    static class Admin20 extends Employee20 {
            private String department;
            public String getDepartment() { return department; }
            public void setDepartment(String department) { this.department = department; }
            void manageDepartment() {
                System.out.println(getEmployeeName() + " manages " + department + " department.");
            }
            @Override double calculateSalary() { return super.calculateSalary(); }
        }

    public static void main(String[] args) {
                System.out.println("\\n=== Question 20: University Employee System ===");
        
                Teacher20 teacher = new Teacher20();
                teacher.setEmployeeId(501); teacher.setEmployeeName("Dr. Rao");
                teacher.setSalary(60000); teacher.setSubject("Computer Science");
                teacher.displayDetails(); teacher.teach(); teacher.conductResearch();
                System.out.println("Teacher total salary: " + teacher.calculateSalary());
        
                VisitingTeacher20 visiting = new VisitingTeacher20();
                visiting.setEmployeeId(502); visiting.setEmployeeName("Ms. Khan");
                visiting.setSalary(0); visiting.setSubject("Java");
                visiting.setHoursWorked(30);
                visiting.displayDetails(); visiting.teach();
                System.out.println("Visiting teacher salary: " + visiting.calculateSalary());
        
                Admin20 admin = new Admin20();
                admin.setEmployeeId(503); admin.setEmployeeName("Mr. Singh");
                admin.setSalary(45000); admin.setDepartment("Admissions");
                admin.displayDetails(); admin.manageDepartment();
                System.out.println("Admin salary: " + admin.calculateSalary());
            
    }
}
