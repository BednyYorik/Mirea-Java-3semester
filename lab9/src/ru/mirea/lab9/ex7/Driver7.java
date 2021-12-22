package ru.mirea.lab9.ex7;

public class Driver7 {
    public static void main(String[] args){
        ThrowsDemo throwsDemo = new ThrowsDemo();
        try {
            throwsDemo.getKey();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

