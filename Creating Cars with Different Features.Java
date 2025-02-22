class Car {
    String color;
    int speed;

    // Default Constructor
    Car() {
        color = "Black";
        speed = 100;
    }

    // Parameterized Constructor
    Car(String c, int s) {
        color = c;
        speed = s;
    }

    void display() {
        System.out.println("🚘 Car Color: " + color + ", Speed: " + speed + " km/h");
    }

    public static void main(String[] args) {
        Car basicCar = new Car();  // Calls Default Constructor
        Car sportsCar = new Car("Red", 200); // Calls Parameterized Constructor

        basicCar.display();
        sportsCar.display();
    }
}
