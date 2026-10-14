/* Standalone Java solution for Question 17: MultiFunctionMachine */
public class Question17 {
    interface Printer17 { void print(); }
    interface Scanner17 { void scan(); }
    static class MultiFunctionMachine17 implements Printer17, Scanner17 {
            private String machineName;
            private int machineId;
            public String getMachineName() { return machineName; }
            public void setMachineName(String machineName) { this.machineName = machineName; }
            public int getMachineId() { return machineId; }
            public void setMachineId(int machineId) { this.machineId = machineId; }
            @Override public void print() { System.out.println("Printing document."); }
            @Override public void scan() { System.out.println("Scanning document."); }
        }

    public static void main(String[] args) {
                System.out.println("\\n=== Question 17: MultiFunctionMachine ===");
                MultiFunctionMachine17 machine = new MultiFunctionMachine17();
                machine.setMachineName("Office MFP"); machine.setMachineId(17);
                System.out.println("Machine: " + machine.getMachineName() + ", ID: " + machine.getMachineId());
                machine.print(); machine.scan();
            
    }
}
