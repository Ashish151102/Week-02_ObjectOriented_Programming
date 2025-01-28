package problemstatements.librarymanagementysystem;

public class LibraryManagementSystem {
    // Main class to test the system
        public static void main(String[] args) {
            // Creating LibraryItem objects
            LibraryItem book = new Book("B12345", "The Great Gatsby", "F. Scott Fitzgerald");
            LibraryItem magazine = new Magazine("M12345", "National Geographic", "Various");
            LibraryItem dvd = new DVD("D12345", "Inception", "Christopher Nolan");

            // Displaying item details
            System.out.println(book.getItemDetails());
            System.out.println("Loan Duration: " + book.getLoanDuration() + " days\n");

            System.out.println(magazine.getItemDetails());
            System.out.println("Loan Duration: " + magazine.getLoanDuration() + " days\n");

            System.out.println(dvd.getItemDetails());
            System.out.println("Loan Duration: " + dvd.getLoanDuration() + " days\n");

            // Reserving items
            ((Reserveable) book).reserveItem();
            ((Reserveable) magazine).reserveItem();
            ((Reserveable) dvd).reserveItem();

            // Checking availability
            System.out.println("\nBook available: " + ((Reserveable) book).checkAvailability());
            System.out.println("Magazine available: " + ((Reserveable) magazine).checkAvailability());
            System.out.println("DVD available: " + ((Reserveable) dvd).checkAvailability());
        }

}
