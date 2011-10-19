package edu.rit.taskers.model;

import javax.persistence.*;
import java.util.Date;



@MappedSuperclass
public abstract class Actionable {


    @Column(name="Name")
    protected String name;

    @Column(name="Description")
	protected String description;
	//protected Contact creator;

    @Column(name="Created")
	protected Date created;
	//protected Contact assignedTo;

	//protected List<Actionable> dependant;

    //protected List<Comment> comments;

    protected Actionable() {}
    /*
    protected Actionable(String name, String description, Contact creator, Date created, Contact assignedTo) {
        this.name = name;
        this.description = description;
        this.creator = creator;
        this.created = created;
        this.assignedTo = assignedTo;
    }
    */

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
    /*

    public Contact getCreator() {
        return creator;
    }

    public void setCreator(Contact creator) {
        this.creator = creator;
    }
    */

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
    /*

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
    */

    @Override
    public String toString() {
        return "Actionable{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", created=" + created +
                '}';
    }
}
