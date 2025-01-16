class Movie_ticket {
    String movie_Name;
    String seat_Number;
    double price;
    boolean isBooked;

    // Constructor to initialize ticket details
    public Movie_ticket(String movie_Name, String seat_Number, double price) {
        this.movie_Name = movie_Name;
        this.seat_Number = seat_Number;
        this.price = price;
        this.isBooked = false;
    }

    // Method to book a ticket
    public void bookTicket() {
        if (!isBooked) {
            isBooked = true;
            System.out.println("Ticket booked successfully for seat: " + seat_Number);
        } else {
            System.out.println("Seat " + seat_Number + " is already booked.");
        }
    }

    // Method to display ticket details
    public void displayDetails() {
        System.out.println("Movie Name: " + movie_Name);
        System.out.println("Seat Number: " + seat_Number);
        System.out.println("Price: " + price);
        System.out.println("Booking Status: " + (isBooked ? "Booked" : "Available"));
    }

    public static void main(String[] args) {
        Movie_ticket ticket = new Movie_ticket("Inception", "A12", 300.0);
        ticket.displayDetails();
        ticket.bookTicket();
        ticket.displayDetails();
        ticket.bookTicket(); // Attempt to book again
    }
}
