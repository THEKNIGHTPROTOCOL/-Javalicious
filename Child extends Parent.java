class Parent {
    int x = 100;

    void show() {
        System.out.println("Parent show()");
    }
}

class Child extends Parent {
    int x = 200;

    void display() {
        System.out.println("x = " + this.x); // refers to child class x
        System.out.println("super x = " + super.x); // refers to parent class x
        super.show(); // calls parent class method
    }
}
