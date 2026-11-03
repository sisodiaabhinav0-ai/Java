import java.util.ArrayList;

// Q12. Generic Container<T> with add() and get()
public class Q12 {
    static class Container<T> {
        private ArrayList<T> items = new ArrayList<>();

        void add(T item) {
            items.add(item);
        }

        T get(int index) {
            return items.get(index);
        }

        int size() {
            return items.size();
        }
    }

    public static void main(String[] args) {
        Container<Integer> intContainer = new Container<>();
        intContainer.add(10);
        intContainer.add(20);

        Container<String> strContainer = new Container<>();
        strContainer.add("Java");
        strContainer.add("Generics");

        Container<Double> dblContainer = new Container<>();
        dblContainer.add(1.5);
        dblContainer.add(2.5);

        System.out.println("Integer Container:");
        for (int i = 0; i < intContainer.size(); i++)
            System.out.println(intContainer.get(i));

        System.out.println("String Container:");
        for (int i = 0; i < strContainer.size(); i++)
            System.out.println(strContainer.get(i));

        System.out.println("Double Container:");
        for (int i = 0; i < dblContainer.size(); i++)
            System.out.println(dblContainer.get(i));
    }
}
