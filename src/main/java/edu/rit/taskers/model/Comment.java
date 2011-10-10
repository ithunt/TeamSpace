package edu.rit.taskers.model;

import java.util.Date;

public class Comment {

    protected Contact creator;
    protected Date created;
    protected String text;

    public Comment(Contact creator, Date created, String text) {
        this.creator = creator;
        this.created = created;
        this.text = text;
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
