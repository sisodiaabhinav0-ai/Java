// Q8. Generic method for three values of the same type
public class Q08 {
    static <T> void display(T a, T b, T c) {
        System.out.println("Values: " + a + ", " + b + ", " + c);
    }

    public static void main(String[] args) {
        display(1, 2, 3);                          // Integers
        display("Red", "Green", "Blue");           // Strings
        display(1.5, 2.5, 3.5);                    // Doubles
    }
}
