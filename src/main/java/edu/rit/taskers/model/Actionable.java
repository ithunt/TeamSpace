package edu.rit.taskers.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity(name="ActionableItem")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Actionable {

    @Id
    @GeneratedValue
    @Column(name="ItemID")
    private int id;

    protected String name;
	protected String description;
	protected Contact creator;
	protected Date created;
	protected Contact assignedTo;

	protected List<Actionable> dependant;

    protected List<Comment> comments;

    protected Actionable() {}

    protected Actionable(String name, String description, Contact creator, Date created, Contact assignedTo) {
        this.name = name;
        this.description = description;
        this.creator = creator;
        this.created = created;
        this.assignedTo = assignedTo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Contact getCreator() {
        return creator;
    }

    public void setCreator(Contact creator) {
        this.creator = creator;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Contact getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(Contact assignedTo) {
        this.assignedTo = assignedTo;
    }

    public List<Actionable> getDependant() {
        return dependant;
    }

    public void setDependant(List<Actionable> dependant) {
        this.dependant = dependant;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
