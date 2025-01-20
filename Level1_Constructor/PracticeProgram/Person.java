class Person {
    String name;
    int age;

    // Parameterized Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Method to display person details
    void display_details() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Person originalPerson = new Person("Tom", 24);
        Person copiedPerson = new Person(originalPerson);

        originalPerson.display_details();
        copiedPerson.display_details();
    }
}
