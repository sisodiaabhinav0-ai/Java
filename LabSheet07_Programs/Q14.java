// Q14. Deadlock using Lock1 and Lock2 (program never terminates)
class Lock1 { }
class Lock2 { }

// Press Ctrl + C to stop this program, it will hang because of deadlock.
public class Q14 {
    static Lock1 lock1 = new Lock1();
    static Lock2 lock2 = new Lock2();

    static void pause() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized (lock1) {                       // Thread-1 takes Lock1 first
                System.out.println("Thread-1: locked Lock1");
                pause();
                System.out.println("Thread-1: waiting for Lock2...");
                synchronized (lock2) {
                    System.out.println("Thread-1: locked Lock2");
                }
            }
        }, "Thread-1");

        Thread t2 = new Thread(() -> {
            synchronized (lock2) {                       // Thread-2 takes Lock2 first
                System.out.println("Thread-2: locked Lock2");
                pause();
                System.out.println("Thread-2: waiting for Lock1...");
                synchronized (lock1) {
                    System.out.println("Thread-2: locked Lock1");
                }
            }
        }, "Thread-2");

        t1.start();
        t2.start();
    }
}
