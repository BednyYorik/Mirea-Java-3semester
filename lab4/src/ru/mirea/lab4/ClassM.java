package ru.mirea.lab4;

public class ClassM extends Planet{
    boolean haveSatellite;

    ClassM(String name, float radius, String mass, boolean isPopulated, boolean haveSatellite) {
        super(name, radius, mass, isPopulated);
        this.haveSatellite = haveSatellite;
    }

    @Override
    public String toString() {
        return "ClassM{" +
                "haveSatellite=" + haveSatellite + super.toString() +
                '}';
    }
}
