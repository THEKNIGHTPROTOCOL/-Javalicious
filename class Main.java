class Student {
    int id = 101;
    String name = "Asif";
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();  // s1 is a reference variable
        System.out.println(s1.id);   // Accessing object members via reference
        System.out.println(s1.name);
    }
}
