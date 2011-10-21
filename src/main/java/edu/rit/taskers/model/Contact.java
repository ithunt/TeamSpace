package edu.rit.taskers.model;

import javax.persistence.*;
import java.net.URL;

@Entity
@Table(name = "Contact")
public class Contact {


    private int id;
    protected String firstName;
    protected String lastName;
    protected String phone;
    protected String email;
    protected String role;
    protected String bio;
    protected URL pictureURL;

    public Contact() {

    }

    public Contact(String firstName, String lastName, String phone, String email, String role, String bio, URL pictureURL) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.role = role;
        this.bio = bio;
        this.pictureURL = pictureURL;
    }
    @Id
    @GeneratedValue
    @Column(name = "ContactID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "FirstName")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "LastName")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "Phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

     @Column(name = "Email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

     @Column(name = "Role")
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Column(name = "Bio")
    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    @Column(name = "PictureURL")
    public URL getPictureURL() {
        return pictureURL;
    }

    public void setPictureURL(URL pictureURL) {
        this.pictureURL = pictureURL;
    }
}
