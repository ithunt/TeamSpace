package edu.rit.taskers.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Task")
public class Task extends Actionable implements Serializable {

    @Id
    @GeneratedValue()
    @Column(name = "TaskID")
    private int id;

    @Column(name = "Due")
    protected Date due;

    @Column(name= "Priority")
    protected int priority;

    public Task() {

    }

    /*
    public Task(String name, String description, Contact creator, Date created, Contact assignedTo) {
        super(name, description, creator, created, assignedTo);
    }
    */

    public int getId() {
        return this.id;
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

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", due=" + due +
                ", priority=" + priority +
                "} " + super.toString();
    }
}
