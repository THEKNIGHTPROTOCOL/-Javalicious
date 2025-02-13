import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input dimensions for first matrix
        System.out.print("Enter the number of rows for first matrix: ");
        int rowsA = scanner.nextInt();
        System.out.print("Enter the number of columns for first matrix: ");
        int colsA = scanner.nextInt();

        // Input dimensions for second matrix
        System.out.print("Enter the number of columns for second matrix: ");
        int colsB = scanner.nextInt();

        // First matrix (A)
        int[][] matrixA = new int[rowsA][colsA];
        // Second matrix (B)
        int[][] matrixB = new int[colsA][colsB];
        // Resultant matrix (Product of A and B)
        int[][] product = new int[rowsA][colsB];

        // Input first matrix elements
        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }

        // Input second matrix elements
        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < colsA; i++) { // Rows of B must match cols of A
            for (int j = 0; j < colsB; j++) {
                matrixB[i][j] = scanner.nextInt();
            }
        }

        // Perform matrix multiplication
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                product[i][j] = 0; // Initialize sum
                for (int k = 0; k < colsA; k++) {
                    product[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        // Display matrices and result
        System.out.println("\nFirst Matrix:");
        printMatrix(matrixA);

        System.out.println("\nSecond Matrix:");
        printMatrix(matrixB);

        System.out.println("\nProduct of Matrices:");
        printMatrix(product);

        scanner.close();
    }

    // Function to print matrices
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
