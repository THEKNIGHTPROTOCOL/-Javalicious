// Checked Exception
public void readFile() throws IOException {
    FileReader file = new FileReader("file.txt"); // File may not exist
}

// Unchecked Exception
public void divide(int a, int b) {
    int result = a / b; // May throw ArithmeticException if b = 0
}
