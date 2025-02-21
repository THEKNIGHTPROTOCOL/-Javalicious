class Car {
    String color;
    int speed;

    Car() {  // Default Constructor
        color = "Black";
        speed = 100;
    }

    Car(String c, int s) {  // Parameterized Constructor
        color = c;
        speed = s;
    }

    void display() {
        System.out.println("Car Color: " + color + ", Speed: " + speed + " km/h");
    }

    public static void main(String[] args) {
        Car basicCar = new Car();  // Calls default constructor
        Car sportsCar = new Car("Red", 200); // Calls parameterized constructor

        basicCar.display();
        sportsCar.display();
    }
}
