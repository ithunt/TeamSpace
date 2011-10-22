package edu.rit.taskers.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import org.hibernate.annotations.ForceDiscriminator;

@Entity
@DiscriminatorValue("2")
@ForceDiscriminator
public class Event extends Actionable implements Serializable {

    private static final long serialVersionUID = -2783488290815458040L;


    protected Date when;

    //Todo: need to add more fields to schema/model


    public Event() {

    }


    @Column(name="When")
    public Date getWhen() {
        return when;
    }

    public void setWhen(Date when) {
        this.when = when;
    }

    @Override
    public String toString() {
        return "Event{" +
                "when=" + when +
                "} " + super.toString();
    }
}
