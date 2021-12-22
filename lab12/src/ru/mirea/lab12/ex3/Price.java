package ru.mirea.lab12.ex3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Price {
    public static void main (String[] args){
        Pattern p1 = Pattern.compile("\\d+(\\.\\d\\d)?\\s?((USD)|(EUR)|(RUB))");
        Scanner str = new Scanner(System.in);
        Matcher m1 = p1.matcher(str.nextLine());
        ArrayList <String> out = new ArrayList<>();
        while (m1.find()){
            out.add(m1.group());
        }
        System.out.println(out);
    }
}
