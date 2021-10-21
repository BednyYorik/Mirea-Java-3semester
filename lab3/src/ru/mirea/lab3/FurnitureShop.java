package ru.mirea.lab3;

import java.util.Vector;

public class FurnitureShop {
    Vector<Furniture> Shop = new Vector<>();

    FurnitureShop() {
        Shop.add(new Table(4, 70, 150, 80, false, 5700, "Classic Table", "metal", 1));
        Shop.add(new Chair(4, 50, 100, 40, true, 2000, "Classic Chair", "wood", true));
        Shop.add(new Sofa(6, 60, 100, 60, true, 17000, "Classic Sofa", "wood", "leather", true));
        Shop.add(new Bed(4, 60, 220, 170, true, 10000, "Classic Bed", "metal", "cloth", 2, 220));
    }

    public void deleteItem(int index) {
        Shop.remove(index);
    }

    public void buyItem(int index) {
        System.out.println("Продано! " + Shop.get(index).toString());
        Shop.remove(index);
    }

    public void ShowItems() {
        for (int i = 0; i < Shop.size(); i++) {
            System.out.println(i + ": " + Shop.get(i).toString() + " " + (Shop.get(i)).forSleeping() + "\n");
        }
    }

    public void deleteVector() {
        Shop.clear();
    }
}
