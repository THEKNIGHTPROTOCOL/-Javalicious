public class ExceptionExample {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;  // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero: " + e);
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
