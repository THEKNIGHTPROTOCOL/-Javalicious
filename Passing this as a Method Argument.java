class A {
    void display(A obj) {
        System.out.println("Method called using: " + obj);
    }

    void callDisplay() {
        display(this); // passing current object
    }
}
