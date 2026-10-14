/* Standalone Java solution for Question 7: Animal Dog Puppy */
public class Question7 {
    static class Animal7 { void eat() { System.out.println("Animal eats."); } }
    static class Dog7 extends Animal7 { void bark() { System.out.println("Dog barks."); } }
    static class Puppy7 extends Dog7 { void play() { System.out.println("Puppy plays."); } }

    public static void main(String[] args) {
                System.out.println("\\n=== Question 7: Animal Dog Puppy ===");
                Puppy7 p = new Puppy7(); p.eat(); p.bark(); p.play();
            
    }
}
