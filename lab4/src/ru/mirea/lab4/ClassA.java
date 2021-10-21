package ru.mirea.lab4;

public class ClassA extends Planet{
    boolean isSatellite;

    ClassA(String name, float radius, String mass, boolean isPopulated, boolean isSatellite) {
        super(name, radius, mass, isPopulated);
        this.isSatellite = isSatellite;
    }

    @Override
    public String toString() {
        return "ClassA{" +
                "isSatellite=" + isSatellite + ", " + super.toString() + '}';
    }
}
