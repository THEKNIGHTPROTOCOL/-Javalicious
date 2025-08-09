class Dog {
    String name;
    String color;

    // Parameterized constructor
    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }  

    // Method to display details
    public void display() {
        System.out.println("Dog Name: " + name);
        System.out.println("Dog Color: " + color);
    }

    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", "Brown");
        myDog.display();
    }
}
