class Rectangle {
    int length, width;

    // Parameterized constructor
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Copy constructor
    public Rectangle(Rectangle rect) {
        this.length = rect.length;
        this.width = rect.width;
    }

    // Method to display rectangle details
    public void display() {
        System.out.println("Rectangle Length: " + length);
        System.out.println("Rectangle Width: " + width);
    }

    public static void main(String[] args) {
        // Creating rectangle object with parameterized constructor
        Rectangle rect1 = new Rectangle(10, 5);
        System.out.println("Original Rectangle:");
        rect1.display();

        // Creating new object using copy constructor
        Rectangle rect2 = new Rectangle(rect1);
        System.out.println("Copied Rectangle:");
        rect2.display();
    }
}
