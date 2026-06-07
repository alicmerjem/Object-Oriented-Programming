package org.example.designpatterns;

public class Laptop {
    private final String brand;
    private final int ram;
    private final boolean hasSSD;

    private Laptop(LaptopBuilder builder) {
        this.brand = builder.brand;
        this.ram = builder.ram;
        this.hasSSD = builder.hasSSD;
    }

    public String getBrand() { return brand; }
    public int getRam() { return ram; }
    public boolean getHasSSD() { return hasSSD; }

    public static class LaptopBuilder {
        private final String brand;
        private int ram;
        private boolean hasSSD;

        public LaptopBuilder(String brand) {
            this.brand = brand;
        }

        public LaptopBuilder setRam(int ram) {
            this.ram = ram;
            return this;
        }

        public LaptopBuilder setHasSSD(boolean hasSSD) {
            this.hasSSD = hasSSD;
            return this;
        }

        public Laptop build() {
            return new Laptop(this);
        }
    }

}
