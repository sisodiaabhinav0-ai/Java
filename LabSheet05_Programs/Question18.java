/* Standalone Java solution for Question 18: ElectricCar Hybrid */
public class Question18 {
    static class Vehicle18 { void start() { System.out.println("Vehicle starts."); } }
    static class Car18 extends Vehicle18 { void drive() { System.out.println("Car drives."); } }
    interface Electric18 { void chargeBattery(); }
    static class ElectricCar18 extends Car18 implements Electric18 {
            @Override public void chargeBattery() { System.out.println("Electric car battery charging."); }
        }

    public static void main(String[] args) {
                System.out.println("\\n=== Question 18: ElectricCar Hybrid ===");
                ElectricCar18 car = new ElectricCar18(); car.start(); car.drive(); car.chargeBattery();
            
    }
}
