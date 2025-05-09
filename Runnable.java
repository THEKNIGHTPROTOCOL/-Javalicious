class EvenSum implements Runnable {
    public void run() {
        int evenSum = 0;
        for (int i = 2; i <= 20; i += 2) {
            evenSum += i;
        }
        System.out.println("Sum of even numbers: " + evenSum);
    }
}

class OddSum implements Runnable {
    public void run() {
        int oddSum = 0;
        for (int i = 1; i <= 20; i += 2) {
            oddSum += i;
        }
        System.out.println("Sum of odd numbers: " + oddSum);
    }
}

public class ThreadSum {
    public static void main(String[] args) {
        Thread t1 = new Thread(new EvenSum());
        Thread t2 = new Thread(new OddSum());

        t1.start();
        t2.start();
    }
}
