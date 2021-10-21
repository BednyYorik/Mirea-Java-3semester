package ru.mirea.lab4;

public class NameableTest {
    public static void main(String[] args){
        Planet p1 = new ClassA("IO", 1821, "8*10^16", false, true);
        Planet p2 = new ClassС("Pluto", 1200, "1*10^22", false );
        Planet p3 = new ClassM("Earth", 6731, "6*10^24", true, true);
        System.out.println("Planet p1: " +p1);
        System.out.println("Planet p2: " + p2);
        System.out.println("Planet p3: " + p3);
        System.out.println("Name Planet p1: " + p1.getName());

        City c1 = new Megapolis("Moscow", 12655000, 289);
        City c2 = new Village("Ivanovka", 1670, 3);
        System.out.println("City c1: " + c1);
        System.out.println("City c2: " + c2);
        System.out.println("Name City c1: " + c1.getName());
        Village c3 = (Village) c2;
        System.out.println("City c3: " + c3);
        c3.setNumberOfChurch(4);
        System.out.println("City c3: " + c3);
    }
}
