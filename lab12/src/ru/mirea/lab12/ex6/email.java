package ru.mirea.lab12.ex6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class email {
    public static void main (String[] args){
        Pattern p1 = Pattern.compile("[a-zA-Z0-9]+[a-zA-Z0-9!#$%&'*+\\-/=?^_`{|}~.]*@[a-zA-Z0-9\\-_.]+\\.[a-zA-Z]+");
        Scanner in = new Scanner(System.in);
        Matcher m1 = p1.matcher(in.nextLine());
        System.out.println(m1.matches() ? "good" : "bed");
    }
}
