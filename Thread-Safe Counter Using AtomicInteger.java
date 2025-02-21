import java.util.concurrent.atomic.AtomicInteger;

class AtomicCounterExample {
    static AtomicInteger count = new AtomicInteger(0); // Atomic counter

    public static void main(String[] args) {
        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Count: " + count.incrementAndGet());
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();
    }
}
