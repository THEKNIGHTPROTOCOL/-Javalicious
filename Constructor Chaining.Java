class Book {
    String title;
    int pages;

    // Constructor 1
    Book() {
        this("Unknown", 100);  // Calls Constructor 2
    }

    // Constructor 2
    Book(String t, int p) {
        title = t;
        pages = p;
    }

    void display() {
        System.out.println("📖 Title: " + title + ", Pages: " + pages);
    }

    public static void main(String[] args) {
        Book b1 = new Book(); // Calls Constructor 1, which calls Constructor 2
        b1.display();
    }
}
