package org.example.designpatterns;

public class Vehicle {
    private String model;
    private int year;
    private boolean isElectric;

    private Vehicle(VehicleBuilder builder) {
        this.model = builder.model;
        this.year = builder.year;
        this.isElectric = builder.isElectric;
    }

    public String getModel() { return model; }
    public int getYear() { return year; }
    public boolean getIsElectric() { return isElectric; }

    public static class VehicleBuilder {
        private String model;
        private int year;
        private boolean isElectric;

        public VehicleBuilder(String model) {
            this.model = model;
        }

        public VehicleBuilder setYear(int year) {
            this.year = year;
            return this;
        }

        public VehicleBuilder setIsElectric(boolean isElectric) {
            this.isElectric = isElectric;
            return this;
        }

        public Vehicle build() {
            return new Vehicle(this);
        }
    }
}
