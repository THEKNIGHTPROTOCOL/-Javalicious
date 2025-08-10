class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}. 

class Dog extends Animal {
    void sound() {
        super.sound(); // calling parent class method
        System.out.println("Dog barks");
    }
}

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
