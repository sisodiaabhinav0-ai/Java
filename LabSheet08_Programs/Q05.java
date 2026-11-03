// Q5. Generic class with two type parameters for Product ID and Price
public class Q05 {
    static class Product<T, U> {
        private T productId;
        private U price;

        Product(T productId, U price) {
            this.productId = productId;
            this.price = price;
        }

        void display() {
            System.out.println("Product ID: " + productId + " | Price: " + price);
        }
    }

    public static void main(String[] args) {
        Product<Integer, Double> p1 = new Product<>(101, 49999.99);
        Product<String, Double> p2 = new Product<>("P102", 1299.50);
        Product<Integer, Integer> p3 = new Product<>(103, 300);

        p1.display();
        p2.display();
        p3.display();
    }
}
