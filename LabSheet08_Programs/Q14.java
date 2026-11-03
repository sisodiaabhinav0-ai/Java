import java.util.ArrayList;

// Q14. Generic method to display all elements of an ArrayList<T>
public class Q14 {
    static <T> void displayList(ArrayList<T> list) {
        for (T item : list) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(20);
        intList.add(30);

        ArrayList<String> strList = new ArrayList<>();
        strList.add("Java");
        strList.add("Python");
        strList.add("C++");

        System.out.println("ArrayList<Integer>:");
        displayList(intList);

        System.out.println("ArrayList<String>:");
        displayList(strList);
    }
}
