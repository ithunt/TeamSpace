package edu.rit.taskers.model;

import java.util.Date;
import java.util.List;

public class Event extends Actionable {

    protected Date startTime;
    protected Date endTime;
    //Todo: Abstract this?
    protected String location;
    protected List<Contact> invited;
    protected List<Contact> attended;


    protected Event(String name, String description, Contact creator, Date created, Contact assignedTo) {
        super(name, description, creator, created, assignedTo);
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Contact> getInvited() {
        return invited;
    }

    public void setInvited(List<Contact> invited) {
        this.invited = invited;
    }

    public List<Contact> getAttended() {
        return attended;
    }

    public void setAttended(List<Contact> attended) {
        this.attended = attended;
    }
}