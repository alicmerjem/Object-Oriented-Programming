package org.example;
import java.util.ArrayList;

public class ArrayList7 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);

        numbers.remove(2); // we cannot do this, it searches for index 2

        numbers.remove(Integer.valueOf(2));
    }
}
