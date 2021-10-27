package ru.mirea.pr3_1;

public class MovablePoint implements Movable {

    public
        int x;
        int y;
        int xSpeed;
        int ySpeed;

    MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public String toString() {
        return "Point (" + x + ", " + y + ")";
    }
    // @Override можно не писать так метод наследуемый от родительского класса не переписывается
    public void moveUp() {
        y++;
    }

    @Override
    public void moveDown() {
        y--;
    }

    @Override
    public void moveRight() {
        x++;
    }

    @Override
    public void moveLeft() {
        x--;
    }
}
