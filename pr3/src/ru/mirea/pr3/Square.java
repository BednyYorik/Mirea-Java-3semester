package ru.mirea.pr3;

public class Square extends Rectangle {
    Square() {
        this.wight = this.length = 1;
        this.color = "yellow";
        this.filled = false;
    }

    Square(double side) {
        this.wight = this.length = side;
        this.color = "yellow";
        this.filled = false;
    }

    Square(double side, String color, boolean filled) {
        this.wight = this.length = side;
        this.color = color;
        this.filled = filled;
    }

    public double GetSide() {
        return wight;
    }

    public void SetSide(double side) {
        this.wight = this.length = side;
    }


    public String toString() {
        return "Shape: square; Side: " + wight + "; Color: " + color + ".";
    }
}
