package edu.rit.taskers.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue
    @Column(name = "UserID")
    private int id;

    protected String login;
    protected String password;
    protected Contact primaryContact;
    protected List<Contact> contacts;

    public User() {

    }

    public User(String login, Contact primaryContact, List<Contact> contacts) {
        this.login = login;
        this.primaryContact = primaryContact;
        this.contacts = contacts;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name= "LoginName")
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Column(name = "Password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Contact getPrimaryContact() {
        return primaryContact;
    }

    public void setPrimaryContact(Contact primaryContact) {
        this.primaryContact = primaryContact;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }
}
