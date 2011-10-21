package edu.rit.taskers.model;

import org.hibernate.annotations.ForceDiscriminator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@DiscriminatorValue("2")
@ForceDiscriminator
public class Event extends Actionable implements Serializable {

    private static final long serialVersionUID = -2783488290815458040L;


    //protected Date when;

    //Todo: need to add more fields to schema/model


    public Event() {

    }
    /*

    public EventDao(String name, String description, Contact creator, Date created, Contact assignedTo) {
        super(name, description, creator, created, assignedTo);
    }
    */


//    @Column(name="When")
//    public Date getWhen() {
//        return when;
//    }
//
//    public void setWhen(Date when) {
//        this.when = when;
//    }

}
