package org.example;

public class Roof extends ChildStage {
    private Material material;

    Roof(Material material) {
        super();
        this.material = material;

    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    Roof() {
        super();
    }
    Roof(String name) {
        super(name);
    }
    @Override
    public String toString() {
        return super.toString() + material;
    }

}
