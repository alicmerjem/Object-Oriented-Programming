package org.example.interfaces;
import java.util.*;

public interface Trainable {
    void enroll();
}

interface Expense {
    void recordExpense(String date, double amount);
}

class Employee implements Trainable, Expense {
    private Map<String, List<Double>> expenses = new HashMap<>();

    @Override
    public void enroll() {
        System.out.println("Employee enrolled in training");
    }

    @Override
    public void recordExpense(String date, double amount) {
        if(!expenses.containsKey(date)) {
            expenses.put(date, new ArrayList<>());
        }
        expenses.get(date).add(amount);
    }

    public double getTotalExpense(String date) {
        if(!expenses.containsKey(date)) {
            return 0.0;
        }

        double total = 0.0;

        for(double amount : expenses.get(date)) {
            total += amount;
        }

        return total;
    }
}
