package org.example;

public enum Status {
    complete("complete"),
    inProgress("in progress"),
    planned("planned"),
    rejected("rejected");
    private final String actualStatus;

    Status(String actualStatus) {
        this.actualStatus = actualStatus;
    }

    public String getActualStatus() {
        return this.actualStatus;
    }
}
