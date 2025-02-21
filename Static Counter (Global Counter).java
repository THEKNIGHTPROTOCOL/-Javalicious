class CounterExample {
    static int count = 0; // Static counter

    public void incrementCounter() {
        count++;
        System.out.println("Method called " + count + " times.");
    }

    public static void main(String[] args) {
        CounterExample obj1 = new CounterExample();
        CounterExample obj2 = new CounterExample();

        obj1.incrementCounter();
        obj2.incrementCounter();
        obj1.incrementCounter();
    }
}
