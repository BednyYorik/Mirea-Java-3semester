package ru.mirea.pr3;

public class Circle extends Shape {
    private double radius;

    Circle() {
        this.radius = 1;
        this.color = "blue";
        this.filled = false;
    }

    Circle(double radius) {
        this.radius = radius;
        this.color = "blue";
        this.filled = false;
    }

    Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double GetRadius() {
        return radius;
    }


    public void SetRadius(double radius) {
        this.radius = radius;
    }


    public double GetArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double GetPerimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Shape: circle; Radius: " + radius + "; Color: " + color + ".";
    }
}
