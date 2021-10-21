package ru.mirea.lab4;

abstract class City implements Nameable{

    private String name;
    private int population;

    City(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "name=" + name + ", population=" + population;
    }
}
