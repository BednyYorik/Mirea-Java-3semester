package ru.mirea.pr9;

import java.math.BigInteger;
import java.util.Scanner;

public class Test {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        while (true){
            try {
                BigInteger innNum = new BigInteger(input.nextLine().trim());
                CheckInn(innNum);
                break;
            }catch (InnException e){
                System.out.println(e.getLocalizedMessage());
            }
        }
        System.out.println("ИНН действителен.");
    }

    public static void CheckInn(BigInteger innNum) throws InnException{
        if (innNum.toString().length() != 12) throw new InnException(innNum);
    }
}
