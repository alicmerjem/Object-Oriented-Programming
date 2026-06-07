package org.example.inheritance;

public class Worker {
    private String name;
    private int baseRate;

    public Worker(String name, int baseRate) {
        this.name = name;
        this.baseRate = baseRate;
    }

    public String getName() { return name; }
    public int getBaseRate() { return baseRate; }
    public void setName(String name) { this.name = name; }
    public void setBaseRate(int baseRate) { this.baseRate = baseRate; }

    public double calculateSalary() {
        return 0.0;
    }
}

class FullTimeWorker extends Worker {
    private int monthsWorked;

    public  FullTimeWorker(String name, int baseRate, int monthsWorked) {
        super(name, baseRate);
        this.monthsWorked = monthsWorked;
    }

    @Override
    public double calculateSalary() {
        return getBaseRate() * monthsWorked * 1.10;
    }
}

class FreelanceWorker extends Worker {
    private int projectsDone;

    public FreelanceWorker(String name, int baseRate, int projectsDone) {
        super(name, baseRate);
        this.projectsDone = projectsDone;
    }

    @Override
    public double calculateSalary() {
        return getBaseRate() * projectsDone * 0.90;
    }
}
