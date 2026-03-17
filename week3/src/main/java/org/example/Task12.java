package org.example;

public class Task12 {
    public void printStatus(OrderStatus status) {
        switch (status) {
            case PENDING -> System.out.println("processing your order");
            case SHIPPED -> System.out.println("your order is on its way");
            case DELIVERED -> System.out.println("your order arrived");
            case CANCELLED -> System.out.println("your order has been cancelled");
        }
    }
}

enum OrderStatus {
    PENDING, SHIPPED, DELIVERED, CANCELLED
}
