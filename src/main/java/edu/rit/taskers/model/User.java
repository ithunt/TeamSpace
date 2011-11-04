package edu.rit.taskers.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "User")
public class User implements Serializable {

    private static final long serialVersionUID = 7515400943255193820L;


    private int id;
    protected String login;
    protected String password;
    protected Contact primaryContact;

    protected Space lastViewedSpace;


    @Id
    @GeneratedValue
    @Column(name = "UserID")
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

    @OneToOne(fetch = FetchType.LAZY, targetEntity = Space.class)
    @JoinColumn(name = "LastViewedSpace")
    public Space getLastViewedSpace() {
        return lastViewedSpace;
    }

    public void setLastViewedSpace(Space lastViewedSpace) {
        this.lastViewedSpace = lastViewedSpace;
    }

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "UserID")
    public Contact getPrimaryContact() {
        return primaryContact;
    }

    public void setPrimaryContact(Contact primaryContact) {
        this.primaryContact = primaryContact;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", primaryContact=" + primaryContact +
                '}';
    }
}
