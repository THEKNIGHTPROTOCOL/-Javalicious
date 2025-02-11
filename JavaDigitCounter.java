import java.util.Scanner; // Import the Scanner class for input

// Define the base class cls1
class cls1 {
    // Method to add two integers
    void add(int p, int q) {
        System.out.println(p + q); // Print the sum of p and q
    }
}

// Define the derived class cls2, inheriting from cls1
class cls2 extends cls1 {
    // Method to multiply two integers
    void mul(int a, int b) {
        System.out.println(a * b); // Print the product of a and b
    }

    // Method to calculate and print the sum of squares of two integers
    void task(int a, int b) {
        int sumOfSquares = (a * a) + (b * b); // Calculate a^2 + b^2
        System.out.println(sumOfSquares); // Print the sum of squares
    }
}

// Main class W03_P2
public class W03_P2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for input

        cls2 obj = new cls2(); // Create an object of class cls2

        int a = sc.nextInt(); // Read the first integer from input
        int b = sc.nextInt(); // Read the second integer from input

        obj.add(a, b); // Call the add method to print the sum
        obj.mul(a, b); // Call the mul method to print the product
        obj.task(a, b); // Call the task method to print the sum of squares

        sc.close(); // Close the scanner to release resources (good practice)
    }
}