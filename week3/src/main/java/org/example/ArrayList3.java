package org.example;
import java.util.ArrayList;

public class ArrayList3 {
    public static void main(String[] args) {
        ArrayList<String> teachers = new ArrayList<>();

        teachers.add("becir");
        teachers.add("mirza");
        teachers.add("samira");
        teachers.add("emina");
        teachers.add("adnan");

        int place = 0;
        System.out.println(teachers.get(place));
        place++;
    }
}
