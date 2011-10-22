package edu.rit.taskers.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import org.hibernate.annotations.ForceDiscriminator;

@Entity
@DiscriminatorValue("1")
@ForceDiscriminator
public class Task extends Actionable implements Serializable {


    private static final long serialVersionUID = 2170818105613256934L;

    protected Date due;
    protected int priority;

    public Task() {

    }

    /*
    public Task(String name, String description, Contact creator, Date created, Contact assignedTo) {
        super(name, description, creator, created, assignedTo);
    }
    */

    @Column(name = "Due")
    public Date getDue() {
        return due;
    }

    public void setDue(Date due) {
        this.due = due;
    }

    @Column(name= "Priority")
    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Task{" +
                "due=" + due +
                ", priority=" + priority +
                "} " + super.toString();
    }
}
