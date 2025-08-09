import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner input = new   Scanner(System.in); 
        
        // Taking input from user
        System.out.print("Enter first integer: ");  
        int num1 = input.nextInt();
        
        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();
        
        // Performing operations
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        double average = (num1 + num2) / 2.0;
        int distance = Math.abs(num1 - num2);
        int max = Math.max(num1, num2);
        int min = Math.min(num1, num2);
        
        // Displaying results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Average: " + average);
        System.out.println("Distance: " + distance);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        
        input.close();
    }
}
