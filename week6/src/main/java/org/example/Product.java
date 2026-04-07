package org.example;
import java.util.*;

public class Product {
    protected String name; // Protected so subclasses can see it easily
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getInfo() {
        return "Product: " + name + " | Price: $" + price;
    }
}

class BookProduct extends Product {
    private String author;

    public BookProduct(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " | Author: " + author;
    }
}

class ElectronicsProduct extends Product {
    private int warrantyMonths;

    public ElectronicsProduct(String name, double price, int warrantyMonths) {
        super(name, price);
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " | Warranty: " + warrantyMonths + " months";
    }
}

class ClothingProduct extends Product {
    private String size;

    public ClothingProduct(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " | Size: " + size;
    }
}

class Main3 {
    public static void main(String[] args) {
        // Create an ArrayList of the Superclass type
        ArrayList<Product> shopCart = new ArrayList<>();

        // UPCASTING: Adding specific items to a general Product list
        shopCart.add(new BookProduct("Java Design Patterns", 45.99, "Erich Gamma"));
        shopCart.add(new ElectronicsProduct("ThinkPad P16", 2500.00, 36));
        shopCart.add(new ClothingProduct("IBU Hoodie", 30.00, "L"));

        System.out.println("--- Shopping Cart Items ---");

        // DYNAMIC DISPATCH: One loop, one method call, different results!
        for (Product p : shopCart) {
            // Even though 'p' is a Product, Java calls the correct Overridden version
            System.out.println(p.getInfo());
        }
    }
}