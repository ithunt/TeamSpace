package edu.rit.taskers.model;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import org.hibernate.annotations.ForceDiscriminator;

@Entity
@DiscriminatorValue("2")
@ForceDiscriminator
public class Event extends Actionable implements Serializable {

	private static final long serialVersionUID = -2783488290815458040L;

	public Event() {
	}

	@Override
	public String toString() {
		return "Event{} " + super.toString();
	}
}
