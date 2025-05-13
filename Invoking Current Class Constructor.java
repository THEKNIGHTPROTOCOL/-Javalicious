class Box {
    int length, breadth;

    Box() {
        this(10, 20); // calls parameterized constructor
        System.out.println("Default constructor");
    }

    Box(int l, int b) {
        this.length = l;
        this.breadth = b;
        System.out.println("Parameterized constructor");
    }
}
