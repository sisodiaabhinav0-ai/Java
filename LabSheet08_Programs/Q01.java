// Q1. Generic Box<T> with Integer, String and Double
public class Q01 {
    static class Box<T> {
        private T value;

        Box(T value) {
            this.value = value;
        }

        T getValue() {
            return value;
        }
    }

    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>(100);
        Box<String> strBox = new Box<>("Hello Generics");
        Box<Double> dblBox = new Box<>(99.5);

        System.out.println("Integer Box : " + intBox.getValue());
        System.out.println("String Box  : " + strBox.getValue());
        System.out.println("Double Box  : " + dblBox.getValue());
    }
}
