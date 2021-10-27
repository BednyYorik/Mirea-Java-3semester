package ru.mirea.pr3;

import java.lang.*;

public class TestShape {
    public static void main (String[] args){
        Shape sh1 = new Circle(4.5,"black",true);
        Shape sh2 = new Square(3,"green", false);
        System.out.println("Shape 1:\n" + sh1);
        System.out.println("Shape 2:\n" + sh2);
        System.out.println("Area of sh2: " + sh2.GetArea());
        System.out.println("Perimeter of sh2: " + sh2.GetPerimeter());

        Shape s1 = new Circle(5.5, "RED", false);
        System.out.println(s1);
        System.out.println(s1.GetArea());
        System.out.println(s1.GetPerimeter());
        System.out.println(s1.GetColor());
        System.out.println(s1.IsFilled());
        //System.out.println(s1.GetRadius()); //У Shape нет методов класса Circle

        Circle c1 = (Circle)s1;
        System.out.println(c1);
        System.out.println(c1.GetArea());
        System.out.println(c1.GetPerimeter());
        System.out.println(c1.GetColor());
        System.out.println(c1.IsFilled());
        System.out.println(c1.GetRadius());

        //Shape s2 = new Shape(); //Мы не можем создать объект от абстрактого класса

        Shape s3 = new Rectangle(1.0, 2.0, "RED", false); // Upcast
        System.out.println(s3);
        System.out.println(s3.GetArea());
        System.out.println(s3.GetPerimeter());
        System.out.println(s3.GetColor());
        //System.out.println(s3.GetLength()); //У Shape нет методов класса Rectangle

        Rectangle r1 = (Rectangle)s3;
        System.out.println(r1);
        System.out.println(r1.GetArea());
        System.out.println(r1.GetColor());
        System.out.println(r1.GetLength());

        Shape s4 = new Square(6.6);
        System.out.println(s4);
        System.out.println(s4.GetArea());
        System.out.println(s4.GetColor());
        //System.out.println(s4.GetSide()); //У Shape нет методов класса Square


        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.GetArea());
        System.out.println(r2.GetColor());
        //System.out.println(r2.GetSide()); // В классе Rectangle не описан класс GetSide
        System.out.println(r2.GetLength());


        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.GetArea());
        System.out.println(sq1.GetColor());
        System.out.println(sq1.GetSide());
        System.out.println(sq1.GetLength());
    }
}
