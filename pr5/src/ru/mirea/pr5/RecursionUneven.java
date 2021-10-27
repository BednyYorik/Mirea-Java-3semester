// Задание 12
package ru.mirea.pr5;

import java.util.Scanner;

public class RecursionUneven {

    public static void Uneven() {
        Scanner input = new Scanner(System.in);
        int last = input.nextInt();
        if (last != 0) {
            if (last % 2 == 1) {
                System.out.print(last  + " ");
            }
            Uneven();
        }

    }

    public static void main(String[] args) {
        Uneven();
    }
}
