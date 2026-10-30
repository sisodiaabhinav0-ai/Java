// Q8. MAX_PRIORITY and MIN_PRIORITY threads
class PrintTask implements Runnable {
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println(t.getName() + " is running with priority " + t.getPriority());
    }
}

public class Q08 {
    public static void main(String[] args) {
        Thread high = new Thread(new PrintTask(), "High-Priority-Thread");
        Thread low = new Thread(new PrintTask(), "Low-Priority-Thread");

        high.setPriority(Thread.MAX_PRIORITY);    // 10
        low.setPriority(Thread.MIN_PRIORITY);     // 1

        System.out.println(high.getName() + " priority = " + high.getPriority());
        System.out.println(low.getName() + " priority = " + low.getPriority());

        high.start();
        low.start();
    }
}
