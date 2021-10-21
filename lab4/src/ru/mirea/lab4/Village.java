package ru.mirea.lab4;

public class Village extends City{
    private int numberOfChurch;

    Village(String name, int population, int numberOfChurch) {
        super(name, population);
        this.numberOfChurch = numberOfChurch;
    }

    public int getNumberOfChurch() {
        return numberOfChurch;
    }

    public void setNumberOfChurch(int numberOfChurch) {
        this.numberOfChurch = numberOfChurch;
    }

    @Override
    public String toString() {
        return "Village{" + super.toString() +
                ", numberOfChurch=" + numberOfChurch +
                '}';
    }
}
