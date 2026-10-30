// Q6. isAlive() before start, while running and after finish
class SleepTask extends Thread {
    public void run() {
        System.out.println("Task is running...");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}

public class Q06 {
    public static void main(String[] args) throws InterruptedException {
        SleepTask t = new SleepTask();
        System.out.println("Before start()    : isAlive = " + t.isAlive());

        t.start();
        Thread.sleep(100);    // give the thread time to start
        System.out.println("While running     : isAlive = " + t.isAlive());

        t.join();             // wait for the thread to finish
        System.out.println("After it finishes : isAlive = " + t.isAlive());
    }
}
