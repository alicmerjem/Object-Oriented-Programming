package org.example;

public class Product<T extends Comparable<T>> {
    private String name;
    private T price;

    public Product(String name, T price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }
    public T getPrice() { return price; }

    public String comparePrice(Product<T> other) {
        int comparison = this.price.compareTo(other.price);

        if (comparison > 0) {
            return "Product " + this.name + " is more expensive than " + other.name;
        } else if (comparison < 0) {
            return "Product " + this.name + " is cheaper than " + other.name;
        } else {
            return "Product " + this.name + " is equal to " + other.name;
        }
    }
}

