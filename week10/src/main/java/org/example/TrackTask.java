package org.example;
import java.lang.reflect.*;
import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TrackTask {
    String assignedTo();
    int priority() default 1;
}

class ProjectTasks {
    @TrackTask(assignedTo = "Bob", priority = 2)
    public void optimizeMemory() {
        System.out.println("Optimizing memory usage...");
    }

    @TrackTask(assignedTo = "Alice", priority = 3)
    public void fixCriticalBug() {
        System.out.println("Fixing a critical bug...");
    }

    @TrackTask(assignedTo = "Charlie")
    public void documentCode() {
        System.out.println("Documenting the project...");
    }
}

class TestingTrackTask {
    public static void main(String[] args) {
        ProjectTasks projectTasks = new ProjectTasks();

        Class<?> clazz = projectTasks.getClass();

        System.out.println("=== Retrieve all methods ===");
        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(TrackTask.class)) {
                TrackTask trackTask = method.getAnnotation(TrackTask.class);

                String priorityLevel;
                int p = trackTask.priority();
                if (p == 3) priorityLevel = "High";
                else if  (p == 2) priorityLevel = "Medium";
                else priorityLevel = "Low";

                System.out.println("Method: " + method.getName());
                System.out.println("Developer: " + trackTask.assignedTo());
                System.out.println("Priority: " +  priorityLevel);
                System.out.println("==========================================");
            }
        }
    }
}
