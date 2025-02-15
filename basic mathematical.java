class MathOperations {
    
    // Addition
    public double add(double a, double b) {
        return a + b;
    }

    // Subtraction
    public double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication
    public double multiply(double a, double b) {
        return a * b;
    }

    // Division
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    // Modulus
    public double modulus(double a, double b) {
        return a % b;
    }

    // Power
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    // Square Root
    public double squareRoot(double a) {
        return Math.sqrt(a);
    }

    // Factorial
    public long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Main method to test the functions
    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        System.out.println("Addition: " + math.add(10, 5));
        System.out.println("Subtraction: " + math.subtract(10, 5));
        System.out.println("Multiplication: " + math.multiply(10, 5));
        System.out.println("Division: " + math.divide(10, 5));
        System.out.println("Modulus: " + math.modulus(10, 5));
        System.out.println("Power: " + math.power(2, 3));
        System.out.println("Square Root: " + math.squareRoot(16));
        System.out.println("Factorial: " + math.factorial(5));
    }
}
