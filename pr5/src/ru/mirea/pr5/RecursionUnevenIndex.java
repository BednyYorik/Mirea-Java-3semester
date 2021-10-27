//Задание 13
package ru.mirea.pr5;

import java.util.Scanner;

public class RecursionUnevenIndex {

    public static void UnevenIndex() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n > 0) {
            int m = input.nextInt();
            System.out.println(n);
            if (m > 0) {
                UnevenIndex();
            }
        }
    }

    public static void main(String[] args) {
        UnevenIndex();
    }
}
