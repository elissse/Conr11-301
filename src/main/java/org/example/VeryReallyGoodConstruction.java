package org.example;

public class VeryReallyGoodConstruction implements Construction {
    private String name;
    private Status status;
    private ChildStage start;
    private ChildStage finish;
    private int length;

    public String getName() {
        return name;
    }

    public Status getStatus() {
        return status;
    }

    public int getLength() {
        return length;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public ChildStage getStart() {
        return start;
    }

    @Override
    public ChildStage getFinish() {
        return finish;
    }

    VeryReallyGoodConstruction(String name) {
        this.name = name;
        this.status = Status.planned;
        this.start = null;
        this.finish = null;
        this.length = 0;
    }

    public void addStageEnd(ChildStage stage) throws RejectedStageException, RejectedProjectException {
        if (stage.getStatus() != Status.rejected) {
            this.length++;
            if (this.finish == null) {
                this.start = stage;
                this.finish = stage;
            } else {
                this.finish.setNext(stage);
                this.start.setPrev(stage);
                stage.setPrev(finish);
                stage.setNext(start);
                this.finish = stage;
            }
        } else if (this.status == Status.rejected) {
            throw new RejectedProjectException();
        } else {
            throw new RejectedStageException();
        }
    }

    public void addToDraft(ChildStage stage) {
        this.length++;
        if (this.finish == null) {
            this.start = stage;
            this.finish = stage;
        } else {
            this.finish.setNext(stage);
            this.start.setPrev(stage);
            stage.setPrev(finish);
            stage.setNext(start);
            this.finish = stage;
        }

    }

    public void printProject() {
        ChildStage current = start;
        for (int i = 0; i < this.length; i++) {
            System.out.println(current);
            current = current.next();
        }
    }

    @Override
    public String toString() {
        return this.name + " is " + this.status;
    }
}
