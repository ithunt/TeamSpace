package edu.rit.taskers.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Space")
public class Space {

    protected int id;
    protected String name;
    protected Date created;
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

    @Id
    @GeneratedValue
    @Column(name = "SpaceID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "Created")
    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @Column(name = "Description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @OneToOne
    @JoinColumn(name = "Creator")
    public Contact getCreator() {
        return creator;
    }

    public void setCreator(Contact creator) {
        this.creator = creator;
    }

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "SpaceID")
    public List<Contact> getUsers() {
        return users;
    }

    public void setUsers(List<Contact> users) {
        this.users = users;
    }

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "SpaceID")
    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "SpaceID")
    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

//    @Override
//    public String toString() {
//        return "Space{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", created=" + created +
//                ", description='" + description + '\'' +
//                ", creator=" + creator +
//                ", users=" + users +
//                ", tasks=" + tasks +
//                ", events=" + events +
//                '}';
//    }
}
