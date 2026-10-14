/* Standalone Java solution for Question 13: Animal Sound Overriding */
public class Question13 {
    static class Animal13 { void makeSound() { System.out.println("Animal makes a sound."); } }
    static class Dog13 extends Animal13 {
            @Override void makeSound() { System.out.println("Dog says: Woof! Woof!"); }
        }
    static class Cat13 extends Animal13 {
            @Override void makeSound() { System.out.println("Cat says: Meow!"); }
        }

    public static void main(String[] args) {
                System.out.println("\\n=== Question 13: Animal Sound Overriding ===");
                Animal13 dog = new Dog13(); Animal13 cat = new Cat13();
                dog.makeSound(); cat.makeSound();
            
    }
}
