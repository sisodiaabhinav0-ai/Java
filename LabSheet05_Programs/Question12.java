/* Standalone Java solution for Question 12: Employee Developer and Manager */
public class Question12 {
    static class Employee12 {
            String employeeName;
            int employeeId;
            void displayEmployee() {
                System.out.println("Name: " + employeeName + ", ID: " + employeeId);
            }
        }
    static class Developer12 extends Employee12 {
            String programmingLanguage;
            void writeCode() { System.out.println(employeeName + " writes " + programmingLanguage + " code."); }
        }
    static class Manager12 extends Employee12 {
            String department;
            void conductMeeting() { System.out.println(employeeName + " conducts a " + department + " meeting."); }
        }

    public static void main(String[] args) {
                System.out.println("\\n=== Question 12: Employee Developer and Manager ===");
                Developer12 d = new Developer12();
                d.employeeName = "Dev"; d.employeeId = 301; d.programmingLanguage = "Java";
                Manager12 m = new Manager12();
                m.employeeName = "Sara"; m.employeeId = 302; m.department = "Engineering";
                d.displayEmployee(); d.writeCode();
                m.displayEmployee(); m.conductMeeting();
            
    }
}
