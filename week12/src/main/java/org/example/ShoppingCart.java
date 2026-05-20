package org.example;
import java.util.*;

public class ShoppingCart {
    ArrayList<String> items = new ArrayList<>();

    private static ShoppingCart instance;

    private ShoppingCart() {};

    public static ShoppingCart getInstance() {
        if (instance == null) {
            instance = new ShoppingCart();
        }
        return instance;
    }

    public void addItem(String itemName) {
        items.add(itemName);
    }

    public void showCart() {
        System.out.println(items);
    }
}

class TestingLogger3 {
    public static void main(String[] args) {
        ShoppingCart catalogScreenCart = ShoppingCart.getInstance();
        ShoppingCart checkoutScreenCart = ShoppingCart.getInstance();

        catalogScreenCart.addItem("Laptop");
        catalogScreenCart.addItem("Wireless Mouse");

        catalogScreenCart.showCart();
    }
}
