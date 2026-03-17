package org.example;
import java.util.*;

public class Task6 {
    public void StudentListOperations() {
        ArrayList<String> students = new ArrayList<>();

        students.add("alice");
        students.add("bob");
        students.add("charlie");
        students.add("diana");

        students.remove("charlie");

        // for loop
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }

        // for each
        for (String name : students) {
            System.out.println(name);
        }

        // while loop
        int i = 0;
        while (i < students.size()) {
            System.out.println(students.get(i));
            i++;
        }
    }
}
