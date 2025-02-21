class Dog {
    String name;
    String color;

    // Parameterized constructor
    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    // Method to display the Dog's details
    public void display() {
        System.out.println("Dog Name: " + name);
        System.out.println("Dog Color: " + color);
    }

    public static void main(String[] args) {
        // Creating Dog objects
        Dog dog1 = new Dog("Buddy", "Brown");
        Dog dog2 = new Dog("Max", "Black");

        // Displaying details
        dog1.display();
        dog2.display();
    }
}
