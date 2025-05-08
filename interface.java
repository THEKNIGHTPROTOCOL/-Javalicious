// First Interface
interface Printable {
    void print();
}

// Second Interface
interface Showable {
    void show();
}

// Class implementing both interfaces
class MultipleInheritanceExample implements Printable, Showable {
    public void print() {
        System.out.println("Printing from Printable interface");
    }

    public void show() {
        System.out.println("Showing from Showable interface");
    }

    public static void main(String[] args) {
        MultipleInheritanceExample obj = new MultipleInheritanceExample();
        obj.print();  // Output: Printing from Printable interface
        obj.show();   // Output: Showing from Showable interface
    }
}
