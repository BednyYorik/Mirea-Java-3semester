package ru.mirea.pr3;

public class Rectangle extends Shape {
    protected
        double wight;
        double length;

    Rectangle() {
        this.length = 1;
        this.wight = 2;
        this.color = "red";
        this.filled = true;
    }

    Rectangle(double wight, double length) {
        this.length = length;
        this.wight = wight;
        this.color = "red";
        this.filled = true;
    }

    Rectangle(double wight, double length, String color, boolean filled) {
        this.length = length;
        this.wight = wight;
        this.color = color;
        this.filled = filled;
    }

    public double GetWight() {
        return wight;
    }

    public void SetWight(double wight) {
        this.wight = wight;
    }

    public double GetLength() {
        return length;
    }

    public void SetLength(double length) {
        this.length = length;
    }

    public double GetArea() {
        return wight * length;
    }

    public double GetPerimeter() {
        return 2 * (wight + length);
    }

    public String toString() {
        return "Shape: rectangle; Wight: " + wight + "Length: " + length + "; Color: " + color + ".";
    }
}
