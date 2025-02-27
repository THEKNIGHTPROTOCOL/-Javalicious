import java.util.Scanner;

class Calculator {
    // Addition
    int add(int a, int b) { return a + b; }
    double add(double a, double b) { return a + b; }
    double add(int a, double b) { return a + b; }
    
    // Subtraction
    int subtract(int a, int b) { return a - b; }
    double subtract(double a, double b) { return a - b; }
    
    // Multiplication
    int multiply(int a, int b) { return a * b; }
    double multiply(double a, double b) { return a * b; }

    // Division with error handling
    double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return 0;
        }
        return (double) a / b;
    }
}

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.println("Sum: " + calc.add(a, b));
        System.out.println("Difference: " + calc.subtract(a, b));
        System.out.println("Product: " + calc.multiply(a, b));
        System.out.println("Quotient: " + calc.divide(a, b));
        
        sc.close();
    }
}
