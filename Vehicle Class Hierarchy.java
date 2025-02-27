class Vehicle {
    String make, model, fuelType;
    int year;

    Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    void display() {
        System.out.println(year + " " + make + " " + model + " (" + fuelType + ")");
    }
}

class Car extends Vehicle {
    Car(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }
}

class Truck extends Vehicle {
    Truck(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }
}

class Motorcycle extends Vehicle {
    Motorcycle(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }
}

public class VehicleHierarchy {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2022, "Petrol");
        Truck truck = new Truck("Ford", "F-150", 2021, "Diesel");
        Motorcycle bike = new Motorcycle("Yamaha", "R1", 2023, "Petrol");

        car.display();
        truck.display();
        bike.display();
    }
}
