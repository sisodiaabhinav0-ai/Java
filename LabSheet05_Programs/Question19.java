/* Standalone Java solution for Question 19: Developer Programmer Researcher */
public class Question19 {
    static class Employee19 {
            private String name;
            private int employeeId;
            public String getName() { return name; }
            public void setName(String name) { this.name = name; }
            public int getEmployeeId() { return employeeId; }
            public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }
            void displayEmployee() { System.out.println("Name: " + name + ", ID: " + employeeId); }
        }
    interface Programmer19 { void writeCode(); }
    interface Researcher19 { void conductResearch(); }
    static class Developer19 extends Employee19 implements Programmer19, Researcher19 {
            @Override public void writeCode() { System.out.println("Developer writes code."); }
            @Override public void conductResearch() { System.out.println("Developer conducts research."); }
        }

    public static void main(String[] args) {
                System.out.println("\\n=== Question 19: Developer Programmer Researcher ===");
                Developer19 d = new Developer19();
                d.setName("Aditi"); d.setEmployeeId(401);
                d.displayEmployee(); d.writeCode(); d.conductResearch();
            
    }
}
