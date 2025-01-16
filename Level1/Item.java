class Item {
    int itemcode;
    String item_name;
    double price;

    // Constructor to initialize item details
    public Item(int itemcode, String item_name, double price) {
        this.itemcode = itemcode;
        this.item_name = item_name;
        this.price = price;
    }

    // Method to display item details
    public void displayDetails() {
        System.out.println("Item Code: " + itemcode);
        System.out.println("Item Name: " + item_name);
        System.out.println("Price: " + price);
    }

    // Method to calculate total cost for given quantity
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        Item item = new Item(101, "Laptop", 50000);
        item.displayDetails();
        int quantity = 2;
        System.out.println("Total Cost: " + item.calculateTotalCost(quantity));
    }
}
