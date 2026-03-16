package org.example;
import java.util.ArrayList;

public class ArrayList4 {
    public static void main(String[] args) {
        ArrayList<String> teachers = new ArrayList<>();

        teachers.add("becir");
        teachers.add("mirza");
        teachers.add("samira");
        teachers.add("emina");
        teachers.add("adnan");

        int place = 0;

        while (place < teachers.size()) {
            System.out.println(teachers.get(place));
            place++;
        }
    }
}
