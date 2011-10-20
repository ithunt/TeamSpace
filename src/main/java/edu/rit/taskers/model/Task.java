package edu.rit.taskers.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Task")
public class Task extends Actionable implements Serializable {


    private static final long serialVersionUID = 2170818105613256934L;

    private int id;
    protected Date due;
    protected int priority;

    public Task() {

    }

    /*
    public Task(String name, String description, Contact creator, Date created, Contact assignedTo) {
        super(name, description, creator, created, assignedTo);
    }
    */

    @Id
    @GeneratedValue()
    @Column(name = "TaskID")
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
                "id=" + id +
                ", due=" + due +
                ", priority=" + priority +
                "} " + super.toString();
    }
}
