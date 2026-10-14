/* Standalone Java solution for Question 9: Vehicle Car ElectricCar */
public class Question9 {
    static class Vehicle9 { void start() { System.out.println("Vehicle starts."); } void stop() { System.out.println("Vehicle stops."); } }
    static class Car9 extends Vehicle9 { void drive() { System.out.println("Car is driving."); } }
    static class ElectricCar9 extends Car9 { void chargeBattery() { System.out.println("Battery is charging."); } }

    public static void main(String[] args) {
                System.out.println("\\n=== Question 9: Vehicle Car ElectricCar ===");
                ElectricCar9 car = new ElectricCar9();
                car.start(); car.drive(); car.chargeBattery(); car.stop();
            
    }
}
