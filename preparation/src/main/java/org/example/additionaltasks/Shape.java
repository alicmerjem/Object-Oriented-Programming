package org.example.additionaltasks;
import java.util.*;

interface Drawable {
    void draw();
}

abstract class Shape implements Drawable {

}


class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Square extends Shape {
    private double sideLength;

    public Square(double  sideLength) {
        this.sideLength = sideLength;
    }

    public double getSideLength() { return sideLength; }
    public void setSideLength(double sideLength) { this.sideLength = sideLength; }

    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}

class ShapeManager {
    public List<Drawable> drawAll(List<Drawable> shapes) {
        for (Drawable shape : shapes) {
            shape.draw();

            if (shape instanceof Circle) {
                Circle c = (Circle) shape;
                c.setRadius(15);
            } else if (shape instanceof Square) {
                Square s = (Square) shape;
                s.setSideLength(5);
            }
        }

        return shapes;
    }
}