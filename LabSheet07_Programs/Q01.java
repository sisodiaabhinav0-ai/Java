// Q1. Thread by extending Thread class (print name 5 times, 200 ms delay)
class NameThread extends Thread {
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

public class Q01 {
    public static void main(String[] args) {
        NameThread t = new NameThread();
        t.start();
    }
}
