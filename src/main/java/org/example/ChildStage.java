package org.example;

public class ChildStage extends Stage implements WhatIsNext {
    private ChildStage next;
    private ChildStage prev;

    public ChildStage(String name) {
        super(name);
        this.next = null;
        this.prev = null;
    }

    public ChildStage() {
        super();
    }

    @Override
    public ChildStage next() {
        return next;
    }

    @Override
    public ChildStage prev() {
        return prev;
    }

    public void setNext(ChildStage stage) {
        this.next = stage;
    }

    public void setPrev(ChildStage stage) {
        this.prev = stage;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void setMaterial(Material material) {

    }
}
