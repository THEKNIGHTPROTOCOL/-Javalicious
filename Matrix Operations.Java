import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input matrix dimensions
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        // Declare matrices
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] sum = new int[rows][cols];
        int[][] difference = new int[rows][cols];

        // Input first matrix
        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        // Input second matrix
        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // Perform addition and subtraction
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
                difference[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        // Print matrices
        System.out.println("\nFirst Matrix:");
        printMatrix(matrix1);

        System.out.println("\nSecond Matrix:");
        printMatrix(matrix2);

        System.out.println("\nMatrix Addition Result:");
        printMatrix(sum);

        System.out.println("\nMatrix Subtraction Result:");
        printMatrix(difference);

        // Multiplication (only possible if columns of A == rows of B)
        System.out.print("\nEnter the number of columns for the second matrix (Multiplication): ");
        int colsB = scanner.nextInt();
        int[][] matrixB = new int[cols][colsB]; // Matrix B for multiplication
        int[][] product = new int[rows][colsB]; // Result matrix

        System.out.println("Enter elements of second matrix for multiplication:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < colsB; j++) {
                matrixB[i][j] = scanner.nextInt();
            }
        }

        // Matrix multiplication logic
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colsB; j++) {
                product[i][j] = 0;
                for (int k = 0; k < cols; k++) {
                    product[i][j] += matrix1[i][k] * matrixB[k][j];
                }
            }
        }

        System.out.println("\nMatrix Multiplication Result:");
        printMatrix(product);

        scanner.close();
    }

    // Function to print matrix in a proper format
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
