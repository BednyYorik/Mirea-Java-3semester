package ru.mirea.pr13;

import java.util.ArrayList;
import java.util.LinkedList;

public class ex5 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        ArrayList<String> arrayList = new ArrayList<>();
        int cases = 100000;
        //Добавление в LinkedList
        long cur = System.currentTimeMillis();
        for (int i = 0; i < cases; i++)
            linkedList.add(Integer.toString(i));
        System.out.println("Время добавления " + cases + " элементов в LinkedList(секунды): " + ((System.currentTimeMillis() - cur) * 0.001));
        //Добавление в ArrayList
        cur = System.currentTimeMillis();
        for (int i = 0; i < cases; i++)
            arrayList.add(Integer.toString(i));
        System.out.println("Время добавления " + cases + " элементов в ArrayList(секунды): " + ((System.currentTimeMillis() - cur) * 0.001));
        //Добавление в LinkedList
        cur = System.currentTimeMillis();
        for (int i = 0; i < cases / 10; i++)
            linkedList.set(i, Integer.toString(i - 1));
        System.out.println("Время вставки " + cases / 100 + " элементов в LinkedList(секунды): " + ((System.currentTimeMillis() - cur) * 0.001));
        //Добавление в ArrayList
        cur = System.currentTimeMillis();
        for (int i = 0; i < cases / 10; i++)
            arrayList.set(i, Integer.toString(i - 1));
        System.out.println("Время вставки " + cases / 100 + " элементов в ArrayList(секунды): " + ((System.currentTimeMillis() - cur) * 0.001));
        //Удаление из LinkedList
        cur = System.currentTimeMillis();
        for (int i = 0; i < cases; i++)
            linkedList.remove(Integer.toString(i));
        System.out.println("Время удаления " + cases + " элементов из LinkedList(секунды): " + ((System.currentTimeMillis() - cur) * 0.001));
        //Удаление из ArrayList
        cur = System.currentTimeMillis();
        for (int i = 0; i < cases; i++)
            arrayList.remove(Integer.toString(i));
        System.out.println("Время удаления " + cases + " элементов из ArrayList(секунды): " + ((System.currentTimeMillis() - cur) * 0.001));
    }
}