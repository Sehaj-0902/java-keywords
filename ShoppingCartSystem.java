class Product {
    private static double discount = 10.0;
    private final int productID;
    private String productName;
    private double price;
    private int quantity;

    // Constructor
    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to display product details
    public void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Name: " + productName);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
        }
    }

    // Method to update the discount
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }
}

public class ShoppingCartSystem {
    public static void main(String[] args) {
        System.out.println("Product Details:");

        Product product1 = new Product(101, "Laptop", 75000, 1);
        product1.displayProductDetails();

        Product product2 = new Product(102, "Smartphone", 45000, 2);
        product2.displayProductDetails();

        System.out.println("\nUpdated Product Details:");
        product1.updateDiscount(15.0);
        System.out.println("New Discount Updated!!");
        product1.displayProductDetails();

        product2.updateDiscount(20.0);
        System.out.println("New Discount Updated!!");
        product2.displayProductDetails();

    }
}

/*
Output:
    Product Details:
    Product ID: 101
    Name: Laptop
    Price: 75000.0
    Quantity: 1
    Discount: 10.0%
    Product ID: 102
    Name: Smartphone
    Price: 45000.0
    Quantity: 2
    Discount: 10.0%

    Updated Product Details:
    New Discount Updated!!
    Product ID: 101
    Name: Laptop
    Price: 75000.0
    Quantity: 1
    Discount: 15.0%
    New Discount Updated!!
    Product ID: 102
    Name: Smartphone
    Price: 45000.0
    Quantity: 2
    Discount: 20.0%
 */