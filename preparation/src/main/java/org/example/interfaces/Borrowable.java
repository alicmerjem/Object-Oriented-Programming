package org.example.interfaces;
import java.util.*;

public interface Borrowable {
    void borrowBook();
}

interface Finable {
    void recordFine(String date, double amount);
}

class Member implements Borrowable, Finable {
    private Map<String, List<Double>> fines = new HashMap<>();

    @Override
    public void borrowBook() {
        System.out.println("Member borrowed a book");
    }

    @Override
    public void recordFine(String date, double amount) {
        if (!fines.containsKey(date)) {
            fines.put(date, new ArrayList<>());
        }

        fines.get(date).add(amount);
    }

    public double getTotalFine(String date) {
        if (!fines.containsKey(date)) {
            return 0.0;
        }

        double total = 0.0;

        for (double amount : fines.get(date)) {
            return total += amount;
        }

        return total;
    }
}
