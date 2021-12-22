package ru.mirea.lab9.ex4;

import java.util.Scanner;

public class Exception4 {
    public static void exceptionDemo() {
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter an integer ");
            String intString = input.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }catch (ArithmeticException e){
            System.out.println("Невозможно выполнить деление на 0.");
        }catch (IllegalArgumentException e){
            System.out.println("Неверный формат.");
        }finally {
            System.out.println("Ошибка.");
        }
    }
}
