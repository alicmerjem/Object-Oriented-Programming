package org.example;
import java.util.*;

public class Task9 {
    public String getRandomStudent(ArrayList<String> list) {
        Random rand = new Random();

        int index = rand.nextInt(list.size());

        return list.get(index);
    }
}
