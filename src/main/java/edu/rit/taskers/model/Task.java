package edu.rit.taskers.model;

import java.util.Date;

public class Task extends Actionable {

    protected Date due;
    protected int priority;

    protected Task(String name, String description, Contact creator, Date created, Contact assignedTo) {
        super(name, description, creator, created, assignedTo);
    }

    public Date getDue() {
        return due;
    }

    public void setDue(Date due) {
        this.due = due;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
