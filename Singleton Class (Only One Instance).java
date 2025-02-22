class Singleton {
    private static Singleton instance; // Stores the single object

    private Singleton() {  // Private Constructor
        System.out.println("Singleton Instance Created");
    }

    public static Singleton getInstance() { // Method to create instance
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
    }
}
