public class AnonymousExample {
    public static void main(String[] args) {
        Runnable obj = new Runnable() {
            public void run() {
                System.out.println("Anonymous inner class implementing Runnable");
            }
        };

        Thread t = new Thread(obj);
        t.start();
    }
}  
