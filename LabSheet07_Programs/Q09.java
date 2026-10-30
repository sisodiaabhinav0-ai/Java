// Q9. Five threads with different priorities
class PriorityTask implements Runnable {
    public void run() {
        // some work so that the threads actually compete for the CPU
        long work = 0;
        for (int i = 0; i < 50000000; i++) {
            work += i % 7;
        }
        Thread t = Thread.currentThread();
        System.out.println(t.getName() + " (priority " + t.getPriority() + ") finished");
    }
}

// Run this program several times and observe the order in which the threads finish.
// Priority is only a hint to the scheduler, so higher priority does not always finish first.
public class Q09 {
    public static void main(String[] args) throws InterruptedException {
        int[] priorities = {1, 3, 5, 7, 10};
        Thread[] threads = new Thread[5];

        for (int i = 0; i < 5; i++) {
            threads[i] = new Thread(new PriorityTask(), "Thread-" + (i + 1));
            threads[i].setPriority(priorities[i]);
        }
        for (Thread t : threads) {
            t.start();
        }
        for (Thread t : threads) {
            t.join();
        }
        System.out.println("All threads completed");
    }
}
