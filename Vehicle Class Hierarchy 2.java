// Base class: Vehicle
abstract class Vehicle {
    String make, model, fuelType;
    int year;

    public Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    abstract double calculateFuelEfficiency();  // Abstract method
    abstract double calculateDistanceTraveled(double fuelUsed);
    abstract double getMaximumSpeed();
}

// Subclass: Car
class Car extends Vehicle {
    public Car(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    double calculateFuelEfficiency() {
        return 15.0; // Example: 15 km per liter
    }

    @Override
    double calculateDistanceTraveled(double fuelUsed) {
        return fuelUsed * calculateFuelEfficiency();
    }

    @Override
    double getMaximumSpeed() {
        return 180.0; // Example: 180 km/h
    }
}

// Subclass: Truck
class Truck extends Vehicle {
    public Truck(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    double calculateFuelEfficiency() {
        return 8.0; // Example: 8 km per liter
    }

    @Override
    double calculateDistanceTraveled(double fuelUsed) {
        return fuelUsed * calculateFuelEfficiency();
    }

    @Override
    double getMaximumSpeed() {
        return 120.0; // Example: 120 km/h
    }
}

// Subclass: Motorcycle
class Motorcycle extends Vehicle {
    public Motorcycle(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    double calculateFuelEfficiency() {
        return 35.0; // Example: 35 km per liter
    }

    @Override
    double calculateDistanceTraveled(double fuelUsed) {
        return fuelUsed * calculateFuelEfficiency();
    }

    @Override
    double getMaximumSpeed() {
        return 200.0; // Example: 200 km/h
    }
}

// Main class to test
public class VehicleTest {
    public static void main(String[] args) {
        Vehicle myCar = new Car("Toyota", "Corolla", 2022, "Petrol");
        System.out.println("Car Distance Traveled: " + myCar.calculateDistanceTraveled(10) + " km");
        System.out.println("Car Max Speed: " + myCar.getMaximumSpeed() + " km/h");

        Vehicle myTruck = new Truck("Volvo", "FH16", 2021, "Diesel");
        System.out.println("Truck Distance Traveled: " + myTruck.calculateDistanceTraveled(10) + " km");
        System.out.println("Truck Max Speed: " + myTruck.getMaximumSpeed() + " km/h");

        Vehicle myBike = new Motorcycle("Yamaha", "R15", 2023, "Petrol");
        System.out.println("Motorcycle Distance Traveled: " + myBike.calculateDistanceTraveled(10) + " km");
        System.out.println("Motorcycle Max Speed: " + myBike.getMaximumSpeed() + " km/h");
    }
}
