class Vehicle {
    void drive() {
        System.out.println("Vehicle is driving");
    }
}

class Car extends Vehicle {
    @Override
    void drive() {
        System.out.println("Repairing a car");
    }
}

public class VehicleApp {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.drive();

        Car c = new Car();
        c.drive();
    }
}
