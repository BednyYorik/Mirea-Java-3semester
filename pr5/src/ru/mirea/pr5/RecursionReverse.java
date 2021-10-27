// Задание 10
// Подходит для значений входящих в предел типа int от -2147483648 до 2147483647.

package ru.mirea.pr5;

import java.util.Scanner;

public class RecursionReverse {

    public static int Reverse(int n, int temp) {
        if (n == 0) {
            return temp;
        } else {
            return Reverse(n / 10, 10 * temp + n % 10);
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число:");
        int n = input.nextInt();
        System.out.println(Reverse(n, 0));
    }
}
