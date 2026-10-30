// Q2. Same as Q1 using Runnable interface
class NameTask implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + ". Abhi");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class Q02 {
    public static void main(String[] args) {
        Thread t = new Thread(new NameTask());
        t.start();
    }
}
