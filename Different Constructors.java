class Student {
    int id;
    String name;

    // No-arg Constructor
    Student() {
        id = 1;
        name = "Default";
    }

    // Parameterized Constructor
    Student(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println(id + " " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();              // No-arg constructor
        Student s2 = new Student(101, "Asif");   // Parameterized constructor

        s1.display();
        s2.display();
    }
}
