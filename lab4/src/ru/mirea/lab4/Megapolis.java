package ru.mirea.lab4;

public class Megapolis extends City{

    private int numberOfSC;

    Megapolis(String name,int population, int numberOfSC) {
        super(name, population);
        this.numberOfSC = numberOfSC;
    }

    public int getNumberOfSC() {
        return numberOfSC;
    }

    public void setNumberOfSC(int numberOfSC) {
        this.numberOfSC = numberOfSC;
    }

    @Override
    public String toString() {
        return "Megapolis{" +
                super.toString() +
                ", numberOfSC=" + numberOfSC +
                '}';
    }
}
