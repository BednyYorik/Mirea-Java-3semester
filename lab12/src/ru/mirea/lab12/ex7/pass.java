package ru.mirea.lab12.ex7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pass {
    public static void main (String[] args){
        Pattern p1 = Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z_]{8,}");
        Scanner in = new Scanner(System.in);
        Matcher m1 = p1.matcher(in.nextLine());
        System.out.println(m1.find());
    }
}
