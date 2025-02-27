class Rectangle {
    int length, width;

    // Parameterized constructor
    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Copy constructor
    Rectangle(Rectangle rect) {
        this.length = rect.length;
        this.width = rect.width;
    }

    void display() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
    }
}

public class RectangleApp {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(10, 5);
        System.out.println("Original Rectangle:");
        rect1.display();

        Rectangle rect2 = new Rectangle(rect1);
        System.out.println("\nCopied Rectangle:");
        rect2.display();
    }
}
