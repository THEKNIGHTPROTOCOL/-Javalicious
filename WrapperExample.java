public class WrapperExample {
    public static void main(String[] args) {
        int x = 10;

        // Wrapping (Boxing)
        Integer obj = Integer.valueOf(x);

        // Unwrapping (Unboxing)
        int y = obj.intValue();

        System.out.println("Original: " + x);
        System.out.println("Wrapped: " + obj);
        System.out.println("Unwrapped: " + y);
    }
}
