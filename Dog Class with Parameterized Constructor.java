class Dog {
    String name, color;

    Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    void display() {
        System.out.println("Dog Name: " + name);
        System.out.println("Dog Color: " + color);
    }
}

public class DogApp {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", "Brown");
        dog.display();
    }
}
