package ru.mirea.lab12.ex5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Date {

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }

    public static void main(String[] args) {
        Pattern p1 = Pattern.compile("(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/([19]\\d\\d|[2-9]\\d{3})");
        Scanner in = new Scanner(System.in);
        Matcher m1 = p1.matcher(in.nextLine());
        boolean flag = true;

        if (m1.matches()){

            String day = m1.group(1);
            String month = m1.group(2);
            int year = Integer.parseInt(m1.group(3));

            if ((month.equals("4") || month.equals("6") || month.equals("9") ||
                    month.equals("04") || month.equals("06") || month.equals("09") ||
                    month.equals("11")) && day.equals("31")) {
                flag = false;
            } else if (month.equals("2") || month.equals("02")) {
                if (day.equals("30") || day.equals("31")) {
                    flag = false;
                } else if (day.equals("29")) {
                    if (!isLeapYear(year)) {
                        flag = false;
                    }
                }
            }
        }

        System.out.println(flag);
    }
}
