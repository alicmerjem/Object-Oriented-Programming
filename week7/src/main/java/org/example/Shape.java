package org.example;
import java.util.*;

abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    abstract double getArea();

    public String getColor() { return color; }
}

class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}

class Testing3 {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<Shape>();

        shapes.add(new Circle("red", 5));
        shapes.add(new Rectangle("green", 5, 2));

        for (Shape s : shapes) {
            System.out.println(s.getColor());
            System.out.println(s.getArea());
        }
    }
}
