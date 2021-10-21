package ru.mirea.lab3;

import java.util.Scanner;

public class FurnitureShopTest extends FurnitureShop {
    public static void main(String[] args) {
        FurnitureShop shop = new FurnitureShop();
        Scanner input = new Scanner(System.in);
        boolean flag = true;

        System.out.println("""
                ______________________________________
                  Добро пожаловать в магазин мебели!
                ______________________________________
                Команды: [1]-удалить, [2]-купить, [3]-показать каталог, [0]-выйти\s
                """);
        while (flag) {

            System.out.println("Выберите команду: ");
            int com = input.nextInt();

            switch (com) {
                case 1 -> {
                    System.out.println("Индекс товара: ");
                    com = input.nextInt();
                    shop.deleteItem(com);
                }
                case 2 -> {
                    System.out.println("Индекс товара: ");
                    com = input.nextInt();
                    shop.buyItem(com);
                }
                case 3 -> shop.ShowItems();
                case 0 -> {
                    shop.deleteVector();
                    flag = false;
                }
            }
        }
    }
}