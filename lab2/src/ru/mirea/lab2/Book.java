package ru.mirea.lab2;

public class Book {
    //Вложенный класс, являющийся свойством основного класса
    //Бред и нахер никому не нужно
    class Author {
        private String author;

        public Author(String author) {
            this.author = author;
        }

        public Author() {
            this.author = "untitled";
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getAuthor() {
            return author;
        }
    }

    class Name {
        private String name;

        public Name(String name) {
            this.name = name;
        }

        public Name() {
            this.name = "untitled";
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    class Year {
        private String year;

        public Year(String year) {
            this.year = year;
        }

        public Year() {
            this.year = "untitled";
        }

        public void setYear(String year) {
            this.year = year;
        }

        public String getYear() {
            return year;
        }
    }

    Author author = new Author();
    Name name = new Name();
    Year year = new Year();

    //Основной конструктор класса
    public Book(String author, String name, String year) {
        this.author.setAuthor(author);
        this.name.setName(name);
        this.year.setYear(year);
    }

    //Конструктор на случай если автор и год написания неизвестны
    public Book(String name) {
        this.name.setName(name);
    }

    public String toString() {
        return "Author: " + author.getAuthor() + "\nName: " + name.getName() +
                "\nYear: " + year.getYear() + "\n";
    }
}
