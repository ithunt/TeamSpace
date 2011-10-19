package edu.rit.taskers.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Space")
public class Space {

    @Id
    @GeneratedValue
    @Column(name = "SpaceID")
    protected String name;

    @Column(name = "Created")
    protected Date created;

    @Column(name = "Description")
    protected String description;
    protected Contact creator;

    protected List<Contact> users;

    protected List<Task> tasks;
    protected List<Event> events;


    public Space() {

    }
    public Space(String name, Date created, Contact creator, List<Contact> users) {
        this.name = name;
        this.created = created;
        this.creator = creator;
        this.users = users;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Contact getCreator() {
        return creator;
    }

    public void setCreator(Contact creator) {
        this.creator = creator;
    }

    public List<Contact> getUsers() {
        return users;
    }

    public void setUsers(List<Contact> users) {
        this.users = users;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
