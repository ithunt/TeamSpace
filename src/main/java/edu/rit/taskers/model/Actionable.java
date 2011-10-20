package edu.rit.taskers.model;

import javax.persistence.*;
import java.util.Date;


@MappedSuperclass
public abstract class Actionable {



    protected String name;
	protected String description;
	//protected Contact creator;
	protected Date created;
	//protected Contact assignedTo;
	//protected List<Actionable> dependant;
    // protected Set<Comment> comments = new HashSet<Comment>(0);

    protected Actionable() {}

    @Column(name="Name")
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    @Column(name="Description")
    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }

    /*
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "Creator")
    public Contact getCreator() {
        return creator;
    }


    public void setCreator(Contact creator) {
        this.creator = creator;
    }
       */


     @Column(name="Created")
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

    */
    /*

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, targetEntity = Comment.class)
    @JoinColumn(name = "ItemID")
    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
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
