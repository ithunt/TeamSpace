package edu.rit.taskers.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

public class Comment {

    @Id
    @GeneratedValue
    @Column(name = "CommentId")
    private int id;

    protected Contact creator;
    protected Date created;
    protected String text;

    public Comment() {

    }

    public Comment(Contact creator, Date created, String text) {
        this.creator = creator;
        this.created = created;
        this.text = text;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Contact getCreator() {
        return creator;
    }

    public void setCreator(Contact creator) {
        this.creator = creator;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
