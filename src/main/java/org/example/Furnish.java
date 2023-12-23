package org.example;

public class Furnish extends ChildStage {
    private Material material;
    Furnish(Material material) {
        super();
        this.material = material;

    }
    Furnish(String name) {
        super(name);
    }
    @Override
    public String toString() {
        return super.toString() + material;
    }
    public Material getMaterial(){
        return this.material;
    }
    public void setMaterial(Material material){
        this.material = material;
    }

    Furnish() {
        super();
    }
}
