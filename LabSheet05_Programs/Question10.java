/* Standalone Java solution for Question 10: Animal Dog and Cat */
public class Question10 {
    static class Animal10 { void eat() { System.out.println("Animal is eating."); } }
    static class Dog10 extends Animal10 { void bark() { System.out.println("Dog barks."); } }
    static class Cat10 extends Animal10 { void meow() { System.out.println("Cat meows."); } }

    public static void main(String[] args) {
                System.out.println("\\n=== Question 10: Animal Dog and Cat ===");
                Dog10 dog = new Dog10(); Cat10 cat = new Cat10();
                dog.eat(); dog.bark(); cat.eat(); cat.meow();
            
    }
}
