package org.example;

public class Walls extends ChildStage {
    private Material material;

    Walls(Material material) {
        super();
        this.material = material;

    }

    public Material getMaterial() {
        return this.material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    Walls() {
        super();
    }

    Walls(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return super.toString() + material;
    }
}
