package ru.mirea.lab9.ex2;

import java.util.Scanner;

public class Exception2 {
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
        }
    }
}
