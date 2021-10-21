package ru.mirea.lab3;

public class Bed extends Furniture{

    private
        String mainMaterial;
        String mattressMaterial;
        int personCount;
        int maxWeight;

    public Bed(int legCount, double height, double wight, double depth, boolean maySeat, int price, String modelName, String mainMaterial, String mattressMaterial, int personCount, int maxWeight) {
        super(legCount, height, wight, depth, maySeat, price, modelName);
        this.mainMaterial = mainMaterial;
        this.mattressMaterial = mattressMaterial;
        this.personCount = personCount;
        this.maxWeight = maxWeight;
    }

    public String getMainMaterial() {
        return mainMaterial;
    }

    public void setMainMaterial(String mainMaterial) {
        this.mainMaterial = mainMaterial;
    }

    public String getMattressMaterial() {
        return mattressMaterial;
    }

    public void setMattressMaterial(String mattressMaterial) {
        this.mattressMaterial = mattressMaterial;
    }

    public int getPersonCount() {
        return personCount;
    }

    public void setPersonCount(int personCount) {
        this.personCount = personCount;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    @Override
    String forSleeping() {
        return "A great solution for sleeping!";
    }

    @Override
    public String toString() {
        return "Bed{" +
                "mainMaterial='" + mainMaterial + '\'' +
                ", mattressMaterial='" + mattressMaterial + '\'' +
                ", personCount=" + personCount +
                ", maxWeight=" + maxWeight +
                ", height=" + height +
                ", wight=" + wight +
                ", depth=" + depth +
                ", maySeat=" + maySeat +
                ", price=" + price +
                ", modelName='" + modelName + '\'' +
                '}';
    }
}
