package ru.mirea.lab3;

public class Chair extends Furniture {

    private
        String material;
        boolean isSquare;

    Chair(int legCount, double height, double wight, double depth, boolean maySeat, int price, String modelName, String material, boolean isSquare) {
        super(4, height, wight, depth, true, price, modelName);
        this.material = material;
        this.isSquare = isSquare;
    }

    public boolean isSquare() {
        return isSquare;
    }

    public void setSquare(boolean square) {
        isSquare = square;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    String forSleeping() {
        return "You can sleep on it, but there is a risk that you will fall!";
    }

    @Override
    public String toString() {
        return "Chair{" +
                "Material='" + material + '\'' +
                ", isSquare=" + isSquare +
                ", height=" + height +
                ", wight=" + wight +
                ", depth=" + depth +
                ", maySeat=" + maySeat +
                ", price=" + price +
                ", modelName='" + modelName + '\'' +
                '}';
    }
}
