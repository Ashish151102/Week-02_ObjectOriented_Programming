class BookSystem {
    String title;
    String author;
    double price;
    boolean available;

    // Parameterized Constructor
    BookSystem(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true; // Default availability
    }

    // Method to borrow the book
    void borrow_book() {
        if (available) {
            available = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Sorry, the book is not available.");
        }
    }

    // Method to display book details
    void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: $" + price + ", Available: " + available);
    }

    public static void main(String[] args) {
        BookSystem book = new BookSystem("Effective Java", "xyz", 700.0);

        book.displayDetails();
        book.borrow_book();
        book.displayDetails();
        book.borrow_book();
    }
}
