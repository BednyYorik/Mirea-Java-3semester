package ru.mirea.lab9.ex8;

public class Driver8 {
    public static void main(String[] args) {
        ThrowsDemo throwsDemo = new ThrowsDemo();
        try {
            throwsDemo.getKey();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
