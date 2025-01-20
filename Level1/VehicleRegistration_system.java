
class Vehicle {
    // Static variable shared across all vehicles
    static double registrationFee = 150.0; // Default registration fee

    // Final variable for a unique registration number
    private final String registrationNumber;

    // Instance variables
    private String ownerName;
    private String vehicleType;

    // Constructor to initialize instance variables
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }
	

    // Static method to update the registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
	

    // Method to display vehicle registration details
    public void displayVehicleDetails() {
        System.out.println("\n\nVehicle Details:");
        System.out.println("Owner Name: " + this.ownerName);
        System.out.println("Vehicle Type: " + this.vehicleType);
        System.out.println("Registration Number: " + this.registrationNumber);
        System.out.println("Registration Fee: " + registrationFee);
    }
}


public class VehicleRegistration_system {
    public static void main(String[] args) {
        // Creating vehicle objects
        Vehicle vehicle1 = new Vehicle("Harry", "Car", "V01");
        Vehicle vehicle2 = new Vehicle("Jhon", "Bike", "V02");

        // Checking instances using instanceof in the main method
        if (vehicle1 instanceof Vehicle) {
            System.out.println("vehicle1 is an instance of Vehicle.");
            vehicle1.displayVehicleDetails();
        } else {
            System.out.println("vehicle1 is not an instance of Vehicle.");
        }

        if (vehicle2 instanceof Vehicle) {
            System.out.println("vehicle2 is an instance of Vehicle.");
            vehicle2.displayVehicleDetails();
        } else {
            System.out.println("vehicle2 is not an instance of Vehicle.");
        }

        // Updating registration fee using static method
        Vehicle.updateRegistrationFee(500.0); // New registration fee

        // Display updated details
        System.out.println("\nAfter updating the registration fee:");
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
    }
}
