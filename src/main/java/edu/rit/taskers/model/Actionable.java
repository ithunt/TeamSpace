package edu.rit.taskers.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;


@Entity(name = "Actionable")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
        name="TypeID",
        discriminatorType = DiscriminatorType.INTEGER
)
public abstract class Actionable {

    protected int id;
    //TODO space id
	//TODO protected Contact creator;
    protected String name;
	protected Date created;
	protected String description;
	//TODO protected Contact assignedTo;
	protected Date due;
	protected String priority;
	protected Date when;
	//TODO protected List<Actionable> dependant;
    //TODO protected Set<Comment> comments = new HashSet<Comment>(0);

    protected Actionable() {}

    @Id
    @GeneratedValue
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name="Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    @OneToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "Creator")
//    public Contact getCreator() {
//        return creator;
//    }
//
//
//    public void setCreator(Contact creator) {
//        this.creator = creator;
//    }

    @Column(name="Created")
    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
	}

    @Column(name="Description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    @Column(name="Due")
  	public Date getDue() {
      	return due;
  	}

  	public void setDue(Date due) {
  		this.due = due;
  	}
    
    @Column(name="Priority")
    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
    
    @Column(name="When")
  	public Date getWhen() {
      	return when;
  	}

  	public void setWhen(Date when) {
  		this.when = when;
  	}

//    public Contact getAssignedTo() {
//        return assignedTo;
//    }
//
//    public void setAssignedTo(Contact assignedTo) {
//        this.assignedTo = assignedTo;
//    }
//
//    public List<Actionable> getDependant() {
//        return dependant;
//    }
//
//    public void setDependant(List<Actionable> dependant) {
//        this.dependant = dependant;
//    }
//
//    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, targetEntity = Comment.class)
//    @JoinColumn(name = "ItemID")
//    public Set<Comment> getComments() {
//        return comments;
//    }
//
//    public void setComments(Set<Comment> comments) {
//        this.comments = comments;
//    }

    @Override
    public String toString() {
        return "Actionable{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", created=" + created +
                '}';
    }
}
