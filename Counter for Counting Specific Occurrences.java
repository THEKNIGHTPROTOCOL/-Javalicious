public class EvenNumberCounter {
    public static void main(String[] args) {
        int[] numbers = {2, 7, 4, 9, 10, 3, 6};  
        int evenCount = 0;  // Counter variable

        for (int num : numbers) {
            if (num % 2 == 0) { // Check if the number is even
                evenCount++; // Increment counter
            }
        }
        System.out.println("Total Even Numbers: " + evenCount);
    }
}
