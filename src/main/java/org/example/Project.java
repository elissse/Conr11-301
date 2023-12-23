package org.example;

public class Project extends ChildStage {

    private ProjectEnum type;

    Project(ProjectEnum type) {
        super();
        this.type = type;
    }
    Project(String name) {
        super(name);
    }
    @Override
    public String toString() {
        return super.toString() + type;
    }

    public ProjectEnum getType() {
        return type;
    }

    public void setType(ProjectEnum type) {
        this.type = type;
    }

    Project() {
        super();
    }
}
