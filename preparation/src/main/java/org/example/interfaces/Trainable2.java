package org.example.interfaces;
import java.util.*;

public interface Trainable2 {
    void enrollInCourse(String courseName);
}

interface Trackable {
    void recordSession(String date, int duration);
}

class Trainee implements Trainable2, Trackable {
    private Map<String, List<Integer>> sessionDuration = new HashMap<>();

    @Override
    public void enrollInCourse(String courseName) {
        System.out.println("Trainee enrolled in course: " + courseName);
    }

    @Override
    public void recordSession(String date, int duration) {
        if(!sessionDuration.containsKey(date)) {
            sessionDuration.put(date, new ArrayList<>());
        }

        sessionDuration.get(date).add(duration);
    }

    public int getTotalSessionTime(String date) {
        if (!sessionDuration.containsKey(date)) {
            return 0;
        }

        int total = 0;

        for (int duration : sessionDuration.get(date)) {
            total += duration;
        }

        return total;
    }
}
