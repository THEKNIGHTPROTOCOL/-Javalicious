class Rectangle {
    double length;
    double width;

    // Parameterized constructor
    public Rectangle(double length, double width) {
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
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
    }

    public static void main(String[] args) {
        // Creating object using parameterized constructor
        Rectangle rect1 = new Rectangle(10.5, 5.5);
        System.out.println("Original Rectangle:");
        rect1.display();

        // Creating object using copy constructor
        Rectangle rect2 = new Rectangle(rect1);
        System.out.println("Copied Rectangle:");
        rect2.display();
    }
}
