// Задание 14
// Подходит для значений входящих в предел типа int от -2147483648 до 2147483647.

package ru.mirea.pr5;

import java.util.Scanner;

public class RecursionNumber {

    public static void Number(Integer n) {
        if (n != 0) {
            Number(n / 10);
            System.out.print(n % 10 + " ");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n > 0) {
            Number(n);
        } else {
            System.out.println("Программа обрабатывает только натуральные числа(1,2,3,...).");
        }

    }
}
