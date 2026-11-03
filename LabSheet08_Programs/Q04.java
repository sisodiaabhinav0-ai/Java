// Q4. Generic Pair<T, U> for Employee ID and Employee Name
public class Q04 {
    static class Pair<T, U> {
        private T first;
        private U second;

        Pair(T first, U second) {
            this.first = first;
            this.second = second;
        }

        T getFirst() {
            return first;
        }

        U getSecond() {
            return second;
        }
    }

    public static void main(String[] args) {
        Pair<Integer, String> emp = new Pair<>(1001, "Rahul");
        System.out.println("Employee ID   = " + emp.getFirst());
        System.out.println("Employee Name = " + emp.getSecond());
    }
}
