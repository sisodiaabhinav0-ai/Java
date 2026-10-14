/* Standalone Java solution for Question 4: Animal to Dog */
public class Question4 {
    static class Animal4 {
            void eat() { System.out.println("Animal is eating."); }
            void sleep() { System.out.println("Animal is sleeping."); }
        }
    static class Dog4 extends Animal4 {
            void bark() { System.out.println("Dog is barking."); }
        }

    public static void main(String[] args) {
                System.out.println("\\n=== Question 4: Animal to Dog ===");
                Dog4 dog = new Dog4();
                dog.eat();
                dog.sleep();
                dog.bark();
            
    }
}
