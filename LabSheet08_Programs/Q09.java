import java.util.ArrayList;

// Q9. ArrayList<Integer> with 10 numbers displayed using a loop
public class Q09 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i * 10);
        }

        System.out.println("Numbers in the list:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }
}
