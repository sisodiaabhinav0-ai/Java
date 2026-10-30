// Q3. Name and priority of the main thread, then change its name
public class Q03 {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Thread name     : " + t.getName());
        System.out.println("Thread priority : " + t.getPriority());

        t.setName("MyMainThread");
        System.out.println("After changing the name:");
        System.out.println("Thread name     : " + t.getName());
        System.out.println("Thread priority : " + t.getPriority());
    }
}
