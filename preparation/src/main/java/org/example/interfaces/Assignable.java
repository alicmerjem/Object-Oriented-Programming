package org.example.interfaces;
import java.util.*;

public interface Assignable {
    abstract void assignProject(String projectName);
}
interface Workable {
    void logWorkHours(String date, double hours);
}

class Employee2 implements Assignable, Workable {
    private Map<String, List<Double>> workHours = new HashMap<>();

    @Override
    public void assignProject(String projectName) {
        System.out.println("Employee assigned to project " + projectName);
    }

    @Override
    public void logWorkHours(String date, double hours) {
        if(!workHours.containsKey(date)) {
            workHours.put(date, new ArrayList<>());
        }
        workHours.get(date).add(hours);
    }

    public double getTotalHours(String date) {
        if(!workHours.containsKey(date)) {
            return 0.0;
        }

        double total = 0.0;

        for (double hours : workHours.get(date)) {
            total += hours;
        }

        return total;
    }
}
