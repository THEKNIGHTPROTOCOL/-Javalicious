// Interface ShapeX is created
interface ShapeX {
    String base = "This is Shape1";
    void display1();
}

// Interface Shapey is created which extends ShapeX
interface Shapey extends ShapeX {
    String base = "This is Shape2";
    void display2();
}

// Class ShapeG is created which implements ShapeY
class ShapeG implements Shapey {
    String base = "This is Shape3";

    // Overriding method in ShapeX interface
    public void display1() {
        System.out.println("Circle: " + ShapeX.base);
    }

    // Override method in Shapey interface
    public void display2() {
        System.out.println("Circle: " + Shapey.base);
    }
}

public class Main {
    public static void main(String[] args) {
        // Object of class ShapeG is created and display methods are called.
        ShapeG circle = new ShapeG();
        circle.display1();
        circle.display2();
    }
}