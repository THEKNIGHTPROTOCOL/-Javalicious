class Student {
    String name;

    // Constructor to set name
    Student(String n) {
        name = n;
    }

    // Copy Constructor (Cloning)
    Student(Student s) {
        name = s.name;
    }

    void display() {
        System.out.println("🎓 Student Name: " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Asif");  // Original student
        Student s2 = new Student(s1);  // Copying student s1

        s1.display();
        s2.display();
    }
}
