package org.example.additionaltasks;
import java.util.*;

interface Enrollable {
    void enroll();
}

interface Payment {
    void makePayment(String date, double amount);
}

public class Student implements Enrollable, Payment {
    private Map<String, List<Double>> payments = new HashMap<>();

    @Override
    public void enroll() {
        System.out.println("Enrolled in a course");
    }

    @Override
    public void makePayment(String date, double amount) {
        if (!payments.containsKey(date)) {
            payments.put(date, new ArrayList<>());
        }
        payments.get(date).add(amount);
    }

    public double getPayment(String date) {
        if (!payments.containsKey(date)) {
            return 0.0;
        }

        double total = 0.0;

        for (double amount : payments.get(date)) {
            total += amount;
        }
        return total;
    }
}
