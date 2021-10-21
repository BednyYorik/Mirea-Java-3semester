package ru.mirea.lab3;

public abstract class Furniture {
    private
    int legCount;
    double height;
    double wight;
    double depth;
    boolean maySeat;
    int price;
    String modelName;


    Furniture(int legCount, double height, double wight, double depth, boolean maySeat, int price, String modelName) {
        this.legCount = legCount;
        this.height = height;
        this.wight = wight;
        this.depth = depth;
        this.maySeat = maySeat;
        this.price = price;
        this.modelName = modelName;
    }

    abstract String forSleeping();

    public int getLegCount() {
        return legCount;
    }

    public void setLegCount(int legCount) {
        this.legCount = legCount;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWight() {
        return wight;
    }

    public void setWight(double wight) {
        this.wight = wight;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public boolean isMaySeat() {
        return maySeat;
    }

    public void setMaySeat(boolean maySeat) {
        this.maySeat = maySeat;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }


    @Override
    public String toString() {
        return "Furniture{" +
                "legCount=" + legCount +
                ", height=" + height +
                ", wight=" + wight +
                ", depth=" + depth +
                ", maySeat=" + maySeat +
                ", price=" + price +
                ", modelName='" + modelName + '\'' +
                '}';
    }
}
