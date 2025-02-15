class MathOperations {
    // Instance variables
    private double num1;
    private double num2;

    // Constructor to initialize values
    public MathOperations(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Addition
    public double add() {
        return num1 + num2;
    }

    // Subtraction
    public double subtract() {
        return num1 - num2;
    }

    // Multiplication
    public double multiply() {
        return num1 * num2;
    }

    // Division
    public double divide() {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return num1 / num2;
    }

    // Modulus
    public double modulus() {
        return num1 % num2;
    }

    // Power
    public double power() {
        return Math.pow(num1, num2);
    }

    // Square Root (for num1)
    public double squareRoot() {
        if (num1 < 0) {
            throw new ArithmeticException("Cannot find square root of a negative number");
        }
        return Math.sqrt(num1);
    }

    // Factorial (for num1)
    public long factorial() {
        int n = (int) num1;
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Main method to test the class
    public static void main(String[] args) {
        MathOperations math = new MathOperations(10, 5);

        System.out.println("Addition: " + math.add());
        System.out.println("Subtraction: " + math.subtract());
        System.out.println("Multiplication: " + math.multiply());
        System.out.println("Division: " + math.divide());
        System.out.println("Modulus: " + math.modulus());
        System.out.println("Power: " + math.power());
        System.out.println("Square Root: " + math.squareRoot());
        System.out.println("Factorial: " + math.factorial());
    }
}
