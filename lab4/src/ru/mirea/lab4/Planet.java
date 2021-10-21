package ru.mirea.lab4;

abstract class Planet implements Nameable {

    private String name;
    private float radius;
    private String mass;
    private boolean isPopulated;


    Planet(String name, float radius, String mass, boolean isPopulated) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
        this.isPopulated = isPopulated;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public String getMass() {
        return mass;
    }

    public void setMass(String mass) {
        this.mass = mass;
    }

    public boolean isPopulated() {
        return isPopulated;
    }

    public void setPopulated(boolean populated) {
        isPopulated = populated;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "name=" + name + ", radius=" + radius + ", mass=" + mass + ", isPopulated=" + isPopulated;
    }
}
