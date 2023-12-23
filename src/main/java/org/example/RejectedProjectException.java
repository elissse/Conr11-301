package org.example;

public class RejectedProjectException extends Exception {
    RejectedProjectException() {
        super("a stage was rejected for a third time!!! we will not try again unfortunately.");
    }

}
