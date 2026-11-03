// Q2. Generic Result<T> storing marks
public class Q02 {
    static class Result<T> {
        private T marks;

        Result(T marks) {
            this.marks = marks;
        }

        T getMarks() {
            return marks;
        }
    }

    public static void main(String[] args) {
        Result<Integer> r1 = new Result<>(85);
        Result<Double> r2 = new Result<>(78.5);

        System.out.println("Marks (Integer) : " + r1.getMarks());
        System.out.println("Marks (Double)  : " + r2.getMarks());
    }
}
