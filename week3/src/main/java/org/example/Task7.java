package org.example;
import java.util.*;

public class Task7 {
    public void sortStudents(ArrayList<String> list) {
        Collections.sort(list);

        for(String name : list) {
            System.out.println(name);
        }
    }
}
