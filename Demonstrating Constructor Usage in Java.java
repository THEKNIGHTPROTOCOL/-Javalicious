class Student {
    String name;
    int age;
    double marks;

    // Default Constructor
    public Student() {
        this.name = "Unknown";
        this.age = 0;
        this.marks = 0.0;
        System.out.println("Default Constructor Called");
    }

    // Parameterized Constructor
    public Student(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
        System.out.println("Parameterized Constructor Called");
    }

    // Copy Constructor
    public Student(Student other) {
        this.name = other.name;
        this.age = other.age;
        this.marks = other.marks;
        System.out.println("Copy Constructor Called");
    }

    // Method to display student details
    public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
        System.out.println();
    }

    public static void main(String[] args) {
        // Using Default Constructor
        Student s1 = new Student();
        s1.display();

        // Using Parameterized Constructor
        Student s2 = new Student("Asif", 20, 89.5);
        s2.display();

        // Using Copy Constructor
        Student s3 = new Student(s2);
        s3.display();
    }
}
