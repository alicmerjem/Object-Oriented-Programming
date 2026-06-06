package org.example.abstraction;

abstract class SubscriptionManager {
    abstract void renewSubscription(int months);
}

class OnlineSubscription extends SubscriptionManager {
    private int activeMonths;
    private String serviceName;

    public OnlineSubscription(String serviceName) {
        this.serviceName = serviceName;
        this.activeMonths = 0;
    }

    public int getActiveMonths() { return activeMonths; }

    @Override
    public void renewSubscription(int months) {
        this.activeMonths += months;
        System.out.println("Subscription for " + this.serviceName + " renewed for " + months + " months.");
    }
}
