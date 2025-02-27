class Vehicle {
    String make, model;
    int year;
    
    Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    void display() {
        System.out.println(year + " " + make + " " + model);
    }
}

class Car extends Vehicle {
    int numDoors;

    Car(String make, String model, int year, int numDoors) {
        super(make, model, year);
        this.numDoors = numDoors;
    }

    void display() {
        super.display();
        System.out.println("Doors: " + numDoors);
    }
}

class Truck extends Vehicle {
    double payloadCapacity;

    Truck(String make, String model, int year, double payloadCapacity) {
        super(make, model, year);
        this.payloadCapacity = payloadCapacity;
    }

    void display() {
        super.display();
        System.out.println("Payload Capacity: " + payloadCapacity + " tons");
    }
}

public class VehicleApp {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 2022, 4);
        Truck truck = new Truck("Ford", "F-150", 2021, 1.5);

        System.out.println("Car Details:");
        car.display();

        System.out.println("\nTruck Details:");
        truck.display();
    }
}
