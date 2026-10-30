// Q4. Two threads printing own name and count 1 to 5
class CountTask implements Runnable {
    public void run() {
        String name = Thread.currentThread().getName();
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " : " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(name + " interrupted");
            }
        }
    }
}

// Run this program 3 times and note whether the output order changes each time.
public class Q04 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new CountTask(), "Thread-A");
        Thread t2 = new Thread(new CountTask(), "Thread-B");
        t1.start();
        t2.start();
    }
}
