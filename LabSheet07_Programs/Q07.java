// Q7. Long-running sum task with join()
class SumThread extends Thread {
    long sum = 0;

    public void run() {
        for (int i = 1; i <= 10000; i++) {
            sum += i;
        }
    }
}

public class Q07 {
    public static void main(String[] args) throws InterruptedException {
        SumThread t = new SumThread();
        t.start();
        System.out.println("Main thread is waiting for the calculation...");
        t.join();    // main waits here until the thread completes
        System.out.println("Sum of 1 to 10000 = " + t.sum);
        System.out.println("Task finished");
    }
}
