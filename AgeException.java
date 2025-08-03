class AgeException extends Exception {
    AgeException(String msg) {
        super(msg);
    }         
}     

public class Test {      
    public static void main(String[] args) {
        try { 
            int age = 15;
            if (age < 18)
                throw new AgeException("Not eligible to vote");
            else
                System.out.println("Eligible");
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
    }
}  
