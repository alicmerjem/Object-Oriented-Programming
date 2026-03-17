package org.example;

public class Task11 {
    public boolean isWeekend(Day day) {
        return day == Day.SATURDAY || day == Day.SUNDAY;
    }
}

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
