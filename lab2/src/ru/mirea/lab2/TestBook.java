package ru.mirea.lab2;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("Pushkin", "Ruslan i Ludmila", "1820");
        System.out.println("Book 1\n" + b1);

        Book b2 = new Book("Tolstoy", "Voina i mir", "1860");
        System.out.println(b2.year.getYear());
        b2.year.setYear("1867");
        System.out.println(b2.year.getYear());
        System.out.println("Book 2\n" + b2);

        Book b3 = new Book("Skazka");
        System.out.println("Book 3\n" + b3);
    }
}
