interface Shape {
    void getArea(); // Define a method without parameters   
}

class Rectangle implements Shape {
    int length, breadth;

    Rectangle(int length, int breadth) { 
        this.length = length;
        this.breadth = breadth;
    }

    public void getArea() {
        int area = length * breadth;
        System.out.println("Area: " + area);
    }
}

class Circle implements Shape {
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    public void getArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area: " + area);
    }
}

class Triangle implements Shape {
    int base, height;

    Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public void getArea() {
        double area = 0.5 * base * height;
        System.out.println("Area: " + area);
    }
}

public class Shaping {
    public static void main(String[] args) {
        Shape r = new Rectangle(2, 3);
        Shape t = new Triangle(2, 3);
        Shape c = new Circle(5);

        r.getArea();
        t.getArea();
        c.getArea();
    }
}
