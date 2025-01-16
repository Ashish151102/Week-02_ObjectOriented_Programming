import java.util.ArrayList;

class Cart_Item {
    String item_name;
    double price;
    int quantity;

    // Constructor to initialize item details
    public Cart_Item(String item_name, double price, int quantity) {
        this.item_name = item_name;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to calculate total cost for the item
    public double getTotalCost() {
        return price * quantity;
    }
}

class ShoppingCart {
    ArrayList<Cart_Item> cartItems;  // Corrected to match the Cart_Item class

    // Constructor to initialize shopping cart
    public ShoppingCart() {
        cartItems = new ArrayList<>();  // Corrected variable name
    }

    // Method to add an item to the cart
    public void addItem(String item_name, double price, int quantity) {
        cartItems.add(new Cart_Item(item_name, price, quantity));  // Corrected to use Cart_Item
        System.out.println(item_name + " added to the cart.");
    }

    // Method to remove an item from the cart
    public void removeItem(String item_name) {
        cartItems.removeIf(item -> item.item_name.equals(item_name));
        System.out.println(item_name + " removed from the cart.");  // Fixed the typo here
    }

    // Method to display the total cost of the cart
    public void displayTotalCost() {
        double totalCost = 0;
        for (Cart_Item item : cartItems) {  // Corrected variable name
            totalCost += item.getTotalCost();
        }
        System.out.println("Total Cost: " + totalCost);
    }
    
    // Method to display cart items
    public void displayItems() {
        if (cartItems.isEmpty()) {
            System.out.println("Cart is empty.");
        } else {
            for (Cart_Item item : cartItems) {  // Corrected variable name
                System.out.println("Item: " + item.item_name + ", Price: " + item.price + ", Quantity: " + item.quantity);
            }
        }
    }
}

public class ShoppingCart_System {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Laptop", 50000.0, 1);
        cart.addItem("Headphones", 2000.0, 2);
        cart.displayItems();
        cart.displayTotalCost();
        cart.removeItem("Headphones");
        cart.displayItems();
        cart.displayTotalCost();
    }
}
