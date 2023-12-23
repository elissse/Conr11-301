package org.example;

public class Foundation extends ChildStage{
    private Material material;
    Foundation(Material material) {
        super();
        this.material = material;

    }
    Foundation(String name) {
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
    Foundation(){super();}

}
