class Test {
    static int count = 0; // static variable

    static { // static block
        System.out.println("Static Block Called");
    }

    static void display() { // static method
        System.out.println("Static Method Called");
    }

    public static void main(String[] args) {
        Test.display();
        System.out.println("Count: " + Test.count);
    }
}
