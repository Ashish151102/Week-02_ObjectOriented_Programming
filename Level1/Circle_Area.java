import java.util.Scanner;

// Creating class to calculate the area of a circle
class AreaOf_circlee {

    // Specifying private data member for radius
    private double radius;

    // Constructor to initialize the radius
    public AreaOf_circlee(double radius) {
        this.radius = radius;
    }

    // Method to calculate and display the area of the circle
    public void displayArea() {
        double area = Math.PI * radius * radius; // Using Math.PI for better precision
        System.out.println("Area of the circle is: " + area);
    }
}

public class Circle_Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        // Prompt the user to enter the radius of the circle
        System.out.print("Enter radius: "); 
        double radius = input.nextDouble();

        // Create an instance of AreaOf_circlee class with the given radius
        AreaOf_circlee area = new AreaOf_circlee(radius); 

        // Display the area of the circle
        area.displayArea(); 

        input.close(); // Close the scanner resource
    }
}
