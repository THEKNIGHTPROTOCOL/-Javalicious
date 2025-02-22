class Car {
    String color;
    int speed;

    // Parameterized Constructor
    Car(String c, int s) {
        color = c;
        speed = s;
    }

    void display() {
        System.out.println("🚘 Car Color: " + color + ", Speed: " + speed + " km/h");
    }

    public static void main(String[] args) {
        Car myCar = new Car("Red", 120);
        myCar.display();
    }
}
