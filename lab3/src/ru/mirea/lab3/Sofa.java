package ru.mirea.lab3;

public class Sofa extends Furniture{

    private
        String mainMaterial;
        String frameMaterial;
        boolean isTransform;

    public Sofa(int legCount, double height, double wight, double depth, boolean maySeat, int price, String modelName, String mainMaterial, String frameMaterial, boolean isTransform) {
        super(legCount, height, wight, depth, true, price, modelName);
        this.mainMaterial = mainMaterial;
        this.frameMaterial = frameMaterial;
        this.isTransform = isTransform;
    }

    public String getMainMaterial() {
        return mainMaterial;
    }

    public void setMainMaterial(String mainMaterial) {
        this.mainMaterial = mainMaterial;
    }

    public String getFrameMaterial() {
        return frameMaterial;
    }

    public void setFrameMaterial(String frameMaterial) {
        this.frameMaterial = frameMaterial;
    }

    public boolean isTransform() {
        return isTransform;
    }

    public void setTransform(boolean transform) {
        isTransform = transform;
    }

    @Override
    String forSleeping() {
        return "You can sleep on it, but it's better to buy a bed)";
    }

    @Override
    public String toString() {
        return "Sofa{" +
                "height=" + height +
                ", wight=" + wight +
                ", depth=" + depth +
                ", maySeat=" + maySeat +
                ", price=" + price +
                ", modelName='" + modelName + '\'' +
                ", mainMaterial='" + mainMaterial + '\'' +
                ", frameMaterial='" + frameMaterial + '\'' +
                ", isTransform=" + isTransform +
                '}';
    }
}
