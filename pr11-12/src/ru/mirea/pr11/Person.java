package ru.mirea.pr11;

public class Person
{
    private String name;
    private String surname;
    private String patronymic;

    public Person(String name, String surname)
    {
        this.name = name;
        this.surname = surname;
    }

    public Person (String surname)
    {
        this.surname = surname;
    }

    public Person (String name, String surname, String patronymic)
    {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public String getInitials()
    {
        String out = this.surname;
        if(this.name != null && this.patronymic != null)
            if (this.name.length() != 0 && this.patronymic.length() != 0)
                out =  this.surname + " " + this.name.toUpperCase().charAt(0) + ". " + this.patronymic.toUpperCase().charAt(0);
        return (out);
    }

    public static void main(String[] args)
    {
        Person test1 = new Person("yaroslav", "stasishin", "Evgenyevich");
        Person test2 = new Person("Kamanin");
        Person test3 = new Person("Ivan", "Ivanov");

        System.out.println(test1.getInitials());
        System.out.println(test2.getInitials());
        System.out.println(test3.getInitials());
    }
}
