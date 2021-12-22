package ru.mirea.lab12.ex2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringF {
    public static void main (String[] args) {
        Pattern p1 = Pattern.compile("abcdefghijklmnopqrstuv18340");
        Scanner str = new Scanner(System.in);
        Matcher m1 = p1.matcher(str.nextLine());
        System.out.println(m1.matches());
    }
}
