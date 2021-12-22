package ru.mirea.pr13;

import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;

public class ex2 {
    public static void main(String[] args) {
        Calendar now = new GregorianCalendar(2021, 11, 17);
        Date cur = now.getTime();
        System.out.println("Сейчас: " + cur);
        System.out.println("Введите дату в формате (день.месяц.год)");
        String input_datetime = new Scanner(System.in).nextLine();

        String[] inp_date = input_datetime.split("\\.");
        Calendar input_datetime_obj = new GregorianCalendar(Integer.parseInt(inp_date[2]), Integer.parseInt(inp_date[1]) - 1, Integer.parseInt(inp_date[0]));
        int comp = cur.compareTo(input_datetime_obj.getTime());
        if (comp == 0) {
            System.out.println("Даты совпадают.");
        } else if (comp < 0) {
            System.out.println("Даты не совпадают. Введенная дата позже");
        } else {
            System.out.println("Даты не совпадают. Введенная дата раньше");
        }

    }
}
