class Demo {
    void show() {
        System.out.println("Show method called");
    }

    void display() {
        this.show();  // calls current class method
    }
}
