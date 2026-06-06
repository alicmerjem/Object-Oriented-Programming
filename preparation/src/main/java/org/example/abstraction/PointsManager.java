package org.example.abstraction;

abstract class PointsManager {
    abstract void addPoints(int points);
}

class StorePoints extends PointsManager {
    private int totalPoints;
    private String customerName;

    public StorePoints(String customerName) {
        this.customerName = customerName;
        this.totalPoints = 0;
    }

    public int getTotalPoints() { return totalPoints; }

    @Override
    public void addPoints(int points) {
        this.totalPoints += points;
        System.out.println(customerName + " earned " + points + " points.");
    }
}
