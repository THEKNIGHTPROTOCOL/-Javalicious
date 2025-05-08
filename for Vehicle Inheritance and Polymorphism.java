// Superclass
class Vehicle {
    private String make, model;
    private int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println(year + " " + make + " " + model);
    }
}

// Car subclass
class Car extends Vehicle {
    private int numDoors;

    public Car(String make, String model, int year, int numDoors) {
        super(make, model, year);
        this.numDoors = numDoors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Doors: " + numDoors);
    }
}

// Truck subclass
class Truck extends Vehicle {
    private double payloadCapacity;

    public Truck(String make, String model, int year, double payloadCapacity) {
        super(make, model, year);
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Payload Capacity: " + payloadCapacity + " tons");
    }
}

// Motorcycle subclass
class Motorcycle extends Vehicle {
    public Motorcycle(String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Motorcycle – No additional attributes");
    }
}

// Main class
public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle v1 = new Car("Toyota", "Camry", 2021, 4);
        Vehicle v2 = new Truck("Volvo", "FH16", 2020, 18.0);
        Vehicle v3 = new Motorcycle("Yamaha", "MT-15", 2022);

        v1.displayInfo();
        v2.displayInfo();
        v3.displayInfo();
    }
}
