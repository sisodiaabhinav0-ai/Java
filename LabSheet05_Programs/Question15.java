/* Standalone Java solution for Question 15: Shape Area Overriding */
public class Question15 {
    static class Shape15 { double calculateArea() { return 0; } }
    static class Circle15 extends Shape15 {
            private final double radius;
            Circle15(double radius) { this.radius = radius; }
            @Override double calculateArea() { return Math.PI * radius * radius; }
        }
    static class Rectangle15 extends Shape15 {
            private final double length, width;
            Rectangle15(double length, double width) { this.length = length; this.width = width; }
            @Override double calculateArea() { return length * width; }
        }

    public static void main(String[] args) {
                System.out.println("\\n=== Question 15: Shape Area Overriding ===");
                Shape15 circle = new Circle15(5);
                Shape15 rectangle = new Rectangle15(4, 6);
                System.out.printf("Circle area: %.2f%n", circle.calculateArea());
                System.out.printf("Rectangle area: %.2f%n", rectangle.calculateArea());
            
    }
}
