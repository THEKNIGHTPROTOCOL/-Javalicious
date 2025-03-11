class Parent {}  
class Child extends Parent {}  

public class Test {  
    public static void main(String args[]) {  
        Child obj = new Child();  
        System.out.println(obj instanceof Parent);  // True  
    }  
}
