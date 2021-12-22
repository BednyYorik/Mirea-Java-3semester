package ru.mirea.lab12.ex4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sum {
    public static void main (String[] args){
        Pattern p1 = Pattern.compile("\\d+\\s*\\+");
        Scanner in = new Scanner(System.in);
        Matcher m1 = p1.matcher(in.nextLine());
        System.out.println(m1.find());
    }
}
