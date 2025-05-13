class Parent {
    int num = 100;
}

class Child extends Parent {
    int num = 200;

    void show() {
        System.out.println("Child num: " + num);
        System.out.println("Parent num: " + super.num);  // accessing parent class variable
    }
}

public class Test {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}
