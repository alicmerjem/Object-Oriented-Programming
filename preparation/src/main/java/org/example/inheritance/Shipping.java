package org.example.inheritance;

public class Shipping {
    private double baseFee;
    private double weight;

    public Shipping(double baseFee, double weight) {
        this.baseFee = baseFee;
        this.weight = weight;
    }

    public double getBaseFee() { return baseFee; }
    public double getWeight() { return weight; }
    public void setBaseFee(double baseFee) { this.baseFee = baseFee; }
    public void setWeight(double weight) { this.weight = weight; }

    public double calculateFee() {
        return 0.0;
    }
}

class StandardShipping extends Shipping {
    private double distance;

    public StandardShipping(double baseFee, double weight, double distance) {
        super(baseFee, weight);
        this.distance = distance;
    }

    @Override
    public double calculateFee() {
        return getBaseFee() + (getWeight() * 2) + (distance * 0.5);
    }
}

class ExpressShipping extends Shipping {
    private int priorityLevel;

    public  ExpressShipping(double baseFee, double weight, int priorityLevel) {
        super(baseFee, weight);
        this.priorityLevel = priorityLevel;
    }

    @Override
    public double calculateFee() {
        return getBaseFee() + (getWeight() * 3) + (priorityLevel * 10);
    }
}