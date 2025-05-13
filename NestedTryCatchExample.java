public class NestedTryCatchExample {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];

            try {
                arr[5] = 100 / 0;  // ArithmeticException
            } catch (ArithmeticException e) {
                System.out.println("Inner Catch: Arithmetic Exception occurred.");
            }

            arr[10] = 50;  // ArrayIndexOutOfBoundsException

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer Catch: Array Index Out Of Bounds.");
        }

        System.out.println("Program continues...");
    }
}
