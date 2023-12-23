package org.example;

public abstract class Stage {
    private String name;
    private Status status;

    protected Stage(String name) {
        this.name = name;
        this.status = Status.planned;
    }

    protected Stage() {
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return name;
    }

}
