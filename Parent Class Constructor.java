class Vehicle {
    Vehicle() {
        System.out.println("Vehicle constructor called");
    }
}

class Car extends Vehicle {
    Car() {
        super(); // must be first statement in constructor
        System.out.println("Car constructor called");
    }
}

public class Test {
    public static void main(String[] args) {
        Car c = new Car();
    }
}
