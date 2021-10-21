package ru.mirea.lab4;

public class ClassС extends Planet{

    ClassС(String name, float radius, String mass, boolean isPopulated) {
        super(name, radius, mass, isPopulated);
    }

    @Override
    public String toString() {
        return "ClassС{"+ super.toString() +"}";
    }
}
