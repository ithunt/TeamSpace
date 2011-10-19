package edu.rit.taskers.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "User")
public class User implements Serializable {

    private static final long serialVersionUID = 7515400943255193820L;

    @Id
    @GeneratedValue
    @Column(name = "UserID")
    private int id;

    @Column(name= "LoginName")
    protected String login;

    @Column(name = "Password")
    protected String password;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
