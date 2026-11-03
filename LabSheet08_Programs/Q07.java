// Q7. Generic method display() for Integer, Double, String and Character
public class Q07 {
    static <T> void display(T value) {
        System.out.println("Value = " + value);
    }

    public static void main(String[] args) {
        display(10);          // Integer
        display(25.75);       // Double
        display("Java");      // String
        display('A');         // Character
    }
}
