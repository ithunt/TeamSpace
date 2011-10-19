package edu.rit.taskers.model;

import javax.persistence.*;
import java.net.URL;

@Entity
@Table(name = "Contact")
public class Contact {

    @Id
    @GeneratedValue
    @Column(name = "ContactID")
    private int id;

    @Column(name = "FirstName")
    protected String name;

    @Column(name = "Phone")
    protected String phone;

    @Column(name = "Email")
    protected String email;

    @Column(name = "Role")
    protected String role;

    @Column(name = "Bio")
    protected String bio;

    @Column(name = "PictureURL")
    protected URL pictureURL;

    public Contact() {

    }

    public Contact(String name, String phone, String email, String role, String bio, URL pictureURL) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.role = role;
        this.bio = bio;
        this.pictureURL = pictureURL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public URL getPictureURL() {
        return pictureURL;
    }

    public void setPictureURL(URL pictureURL) {
        this.pictureURL = pictureURL;
    }
}
