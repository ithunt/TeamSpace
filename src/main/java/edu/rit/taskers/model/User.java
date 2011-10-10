package edu.rit.taskers.model;

import java.util.List;

public class User {

    protected String login;
    protected String password;
    protected Contact primaryContact;
    protected List<Contact> contacts;

    public User(String login, Contact primaryContact, List<Contact> contacts) {
        this.login = login;
        this.primaryContact = primaryContact;
        this.contacts = contacts;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

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
