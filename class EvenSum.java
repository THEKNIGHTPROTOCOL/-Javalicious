// SumEvenOdd.java
class EvenSum implements Runnable {
    public void run() {
        int evenSum = 0;
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0)
                evenSum += i;
        }
        System.out.println("Sum of Even Numbers (1 to 20): " + evenSum);
    }
}

class OddSum implements Runnable {
    public void run() {
        int oddSum = 0;
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0)
                oddSum += i;
        }
        System.out.println("Sum of Odd Numbers (1 to 20): " + oddSum);
    }
}

public class SumEvenOdd {
    public static void main(String[] args) {
        Runnable evenRunnable = new EvenSum();
        Runnable oddRunnable = new OddSum();

        Thread evenThread = new Thread(evenRunnable);
        Thread oddThread = new Thread(oddRunnable);

        evenThread.start();
        oddThread.start();
    }
}
