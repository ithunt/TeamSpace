package edu.rit.taskers.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Event")
public class Event extends Actionable implements Serializable {

    private static final long serialVersionUID = -2783488290815458040L;
    @Id
    @GeneratedValue
    @Column(name="EventID")
    private int id;

    @Column(name="When")
    protected Date when;

    //Todo: need to add more fields to schema/model


    public Event() {
        super();
    }
    /*

    public EventDao(String name, String description, Contact creator, Date created, Contact assignedTo) {
        super(name, description, creator, created, assignedTo);
    }
    */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getWhen() {
        return when;
    }

    public void setWhen(Date when) {
        this.when = when;
    }

}
