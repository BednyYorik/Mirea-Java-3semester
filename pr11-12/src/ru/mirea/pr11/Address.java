package ru.mirea.pr11;

public class Address
{
    private String country;
    private String region;
    private String city;
    private String street;
    private String building;
    private String part;
    private String apt;

    public Address(String address)
    {
        String[] s_a = address.split(",");
        country = s_a[0].trim();
        region = s_a[1].trim();
        city = s_a[2].trim();
        street = s_a[3].trim();
        building = s_a[4].trim();
        part = s_a[5].trim();
        apt = s_a[6].trim();
    }

    public String toString()
    {
        return (country + region + city + street + building + part + apt);
    }

    public static void main(String[] args)
    {
        Address test1 = new Address("Страна1, Регион1, Город1, Улица1, Дом1, Корпус1, Квартира1");
        Address test2 = new Address("Страна2, Регион2, Город2, Улица2, Дом2, Корпус2, Квартира2");

        System.out.println(test1);
        System.out.println(test2);
    }
}
