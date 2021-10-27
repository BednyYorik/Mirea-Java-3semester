package ru.mirea.pr1;

public class TestBook {
    public static void main (String[] args){
        Book b1 = new Book ("name1", "author1", "2000");
        Book b2 = new Book ("name2");
        Book b3 = new Book ("name3", "author3", "-");

        System.out.println(b1);
        System.out.println(b2);

        System.out.println();
        System.out.println(b3);
        b3.setYear("2017");
        System.out.println(b3);
    }
}
