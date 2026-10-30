// Q15. Deadlock fixed: both threads acquire Lock1 then Lock2
class Lock1 { }
class Lock2 { }

public class Q15 {
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
            synchronized (lock1) {                       // same order: Lock1 first
                System.out.println("Thread-1: locked Lock1");
                pause();
                synchronized (lock2) {                   // then Lock2
                    System.out.println("Thread-1: locked Lock2");
                }
            }
            System.out.println("Thread-1: finished");
        }, "Thread-1");

        Thread t2 = new Thread(() -> {
            synchronized (lock1) {                       // same order: Lock1 first
                System.out.println("Thread-2: locked Lock1");
                pause();
                synchronized (lock2) {                   // then Lock2
                    System.out.println("Thread-2: locked Lock2");
                }
            }
            System.out.println("Thread-2: finished");
        }, "Thread-2");

        t1.start();
        t2.start();
    }
}
