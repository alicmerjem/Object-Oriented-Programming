package org.example;
import java.util.*;

public class Task10 {
    public ArrayList<Integer> filterNumbers(ArrayList<Integer> list) {
        Collections.sort(list);

        list.removeIf(n -> n % 2 == 0);

        return list;
    }
}
