package org.example.additionaltasks;

public class Item {
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }
    public int getPrice() { return price; }
    public void setName(String name) { this.name = name; }
    public void setPrice(int price) { this.price = price; }

    public double calculateTax() {
        return 0.0;
    }
}

class Chocolate extends Item {
    private double cocoaPercentage;

    public Chocolate(String name, int price, double cocoaPercentage) {
        super(name, price);
        this.cocoaPercentage = cocoaPercentage;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.12;
    }
}

class Cigarettes extends Item {
    private double nicotinePercentage;

    public Cigarettes(String name, int price, double nicotinePercentage) {
        super(name, price);
        this.nicotinePercentage = nicotinePercentage;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.89;
    }
}