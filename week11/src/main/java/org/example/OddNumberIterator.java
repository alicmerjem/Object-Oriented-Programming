package org.example;
import java.util.*;

public class OddNumberIterator {
    private int[] numbers;
    private int currentIndex = 0;

    public OddNumberIterator(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public boolean hasNext() {
        while (currentIndex < numbers.length) {
            int current = numbers[currentIndex];
            if (current > 0 && current % 2 != 0) {
                return true;
            }
            currentIndex++;
        }
        return false;
    }
}
