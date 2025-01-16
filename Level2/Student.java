class Student {
    String name;
    int roll_number;
    double marks;

    // Constructor to initialize student details
    public Student(String name, int roll_number, double marks) {
        this.name = name;
        this.roll_number = roll_number;
        this.marks = marks;
    }

    // Method to calculate grade based on marks
    public String calculateGrade() {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 75) {
            return "B";
        } else if (marks >= 50) {
            return "C";
        } else {
            return "F";
        }
    }

    // Method to display student details and grade
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + roll_number);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
        Student student = new Student("John Doe", 101, 85.5);
        student.displayDetails();
    }
}
