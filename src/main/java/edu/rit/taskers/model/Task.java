package edu.rit.taskers.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import org.hibernate.annotations.ForceDiscriminator;

@Entity
@DiscriminatorValue("1")
@ForceDiscriminator
public class Task extends Actionable implements Serializable {

	private static final long serialVersionUID = 2170818105613256934L;

	protected String priority;

	public Task() {
	}

	@Column(name= "Priority")
	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	@Override
	public String toString() {
		return "Task{priority=" + priority + "} " + super.toString();
	}
}
