// Q13. Producer-consumer using wait() and notify()
class Buffer {
    private int value;
    private boolean available = false;    // single-slot buffer

    synchronized void put(int v) {
        while (available) {               // slot is full, producer waits
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        value = v;
        available = true;
        System.out.println("Produced: " + v);
        notify();                         // wake up the consumer
    }

    synchronized int get() {
        while (!available) {              // slot is empty, consumer waits
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        available = false;
        System.out.println("Consumed: " + value);
        notify();                         // wake up the producer
        return value;
    }
}

class Producer extends Thread {
    private Buffer buffer;

    Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            buffer.put(i);
        }
    }
}

class Consumer extends Thread {
    private Buffer buffer;

    Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            buffer.get();
        }
    }
}

public class Q13 {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        new Producer(buffer).start();
        new Consumer(buffer).start();
    }
}
