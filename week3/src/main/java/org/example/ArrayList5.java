package org.example;
import java.util.ArrayList;
import java.util.*;

public class ArrayList5 {
    public static void main(String[] args) {
        ArrayList<String> teachers = new ArrayList<>();

        teachers.add("becir");
        teachers.add("mirza");
        teachers.add("samira");
        teachers.add("emina");
        teachers.add("adnan");

        Collections.sort(teachers);
        for (String teacher : teachers) {
            System.out.println(teacher);
        }
    }
}
