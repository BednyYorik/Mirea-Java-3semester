package ru.mirea.lab3;

public class Table extends Furniture{

    private
        String material;
        int beds;

    public Table(int legCount, double height, double wight, double depth, boolean maySeat, int price, String modelName, String material, int beds) {
        super(legCount, height, wight, depth, false, price, modelName);
        this.material = material;
        this.beds = beds;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getBeds() {
        return beds;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    @Override
    String forSleeping() {
        return "You can sleep on it, but it's indecent!";
    }

    @Override
    public String toString() {
        return "Table{" +
                "height=" + height +
                ", wight=" + wight +
                ", depth=" + depth +
                ", maySeat=" + maySeat +
                ", price=" + price +
                ", modelName='" + modelName + '\'' +
                ", Material='" + material + '\'' +
                ", beds=" + beds +
                '}';
    }
}
