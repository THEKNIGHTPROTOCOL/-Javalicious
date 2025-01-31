class Person {
    String name;
    int age;

    // Constructor to initialize the object
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person's info
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ObjectExample {
    public static void main(String[] args) {
        // Creating objects
        Person p1 = new Person("Alice", 30);
        Person p2 = new Person("Bob", 25);
        
        // Displaying information
        p1.displayInfo();
        p2.displayInfo();
    }
}
