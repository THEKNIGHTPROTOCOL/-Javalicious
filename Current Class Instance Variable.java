class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;       // this refers to instance variable
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }
}
