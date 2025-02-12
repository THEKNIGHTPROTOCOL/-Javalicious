interface ShapeX {
    String base = "This is Shape1";
    void display1();
}

interface Shapey extends ShapeX {
    String base = "This is Shape2";
    void display2();
}

class ShapeG implements Shapey {  // Class definition starts here
    // String base = "This is Shape3";  // Remove this line to avoid shadowing

    public void display1() {      // Method inside the class
        System.out.println("Circle: " + ShapeX.base);
    }

    public void display2() {      // Method inside the class
        System.out.println("Circle: " + Shapey.base);
    }
} // Class definition ends here

public class Main {
    public static void main(String[] args) {
        ShapeG circle = new ShapeG();
        circle.display1();
        circle.display2();
    }
}