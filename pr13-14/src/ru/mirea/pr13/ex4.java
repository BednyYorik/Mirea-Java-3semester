package ru.mirea.pr13;

import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;

public class ex4 {
    public static void main(String[] args) {
        System.out.println("Введите дату: ");
        try {
            String input = new Scanner(System.in).nextLine();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmm");
            Date inputted_datetime_obj = formatter.parse(input);
            System.out.println("DATE OBJ: " + inputted_datetime_obj);
            Calendar inputted_calendar_obj = Calendar.getInstance();
            inputted_calendar_obj.setTime(formatter.parse(input));
            System.out.println("CALENDAR OBJ: " + inputted_calendar_obj.getTime());
        } catch (ParseException e) {
            System.out.println(e);
        }
    }
}
