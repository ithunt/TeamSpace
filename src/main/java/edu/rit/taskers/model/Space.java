package edu.rit.taskers.model;

import java.util.Date;
import java.util.List;

public class Space {

    protected String name;
    protected Date created;
    protected Contact creator;

    protected List<Contact> users;

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
}
