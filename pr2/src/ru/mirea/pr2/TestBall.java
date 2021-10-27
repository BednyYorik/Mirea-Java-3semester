package ru.mirea.pr2;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball();
        Ball b2 = new Ball(1.0, 3.5);
        // Проверка метода toString()
        System.out.println("b1: " + b1);
        System.out.println("b2: " + b2);
        // Проверка методов геттеров getX() и getY() и одного из сеттера setXY()
        System.out.println(b1.getX() + " " + b1.getY());
        b1.setXY(1,8);
        System.out.println("b1: " + b1);
        // Проверка методов сеттеров setX() и setY()
        b2.setX(1.5);
        b2.setY(3);
        System.out.println("b2: " + b2);
        //Проверка метода move()
        b2.move(3,0.5);
        System.out.println("b2: " + b2);
    }
}
