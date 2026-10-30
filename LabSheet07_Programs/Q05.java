import java.util.Random;

// Q5. Reader, Writer and Logger threads with random sleep (0-500 ms)
class Worker implements Runnable {
    private String message;

    Worker(String message) {
        this.message = message;
    }

    public void run() {
        int delay = new Random().nextInt(501);    // 0 to 500 ms
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println(Thread.currentThread().getName() + " (after " + delay + " ms): " + message);
    }
}

public class Q05 {
    public static void main(String[] args) {
        Thread reader = new Thread(new Worker("Reading data"), "Reader");
        Thread writer = new Thread(new Worker("Writing data"), "Writer");
        Thread logger = new Thread(new Worker("Logging activity"), "Logger");
        reader.start();
        writer.start();
        logger.start();
    }
}
