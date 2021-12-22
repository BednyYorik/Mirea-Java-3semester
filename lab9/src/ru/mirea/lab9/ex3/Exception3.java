package ru.mirea.lab9.ex3;

import java.util.Scanner;

public class Exception3 {
    public static void exceptionDemo() {
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter an integer ");
            String intString = input.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }catch (Exception e){
            System.out.println("Ошибка");
        }
        //Класс Exception находится выше по иерархии, чем ArithmeticException и IllegalArgumentException
        /*catch (ArithmeticException e){
            System.out.println("Невозможно выполнить деление на 0.");
        }catch (IllegalArgumentException e){
            System.out.println("Неверный формат.");
        }*/
    }
}
