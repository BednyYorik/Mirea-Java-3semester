package ru.mirea.lab12.ex1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringSPL {
    public static void main (String[] args){
        Scanner str = new Scanner(System.in);
        Scanner tok = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(str.nextLine(),tok.nextLine());
        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
