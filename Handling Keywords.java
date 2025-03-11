try {  
    int result = 10 / 0;  // Throws an exception  
} catch (ArithmeticException e) {  
    System.out.println("Cannot divide by zero");  
} finally {  
    System.out.println("Execution complete");  
}
