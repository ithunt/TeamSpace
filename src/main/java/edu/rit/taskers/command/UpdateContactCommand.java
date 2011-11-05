package edu.rit.taskers.command;

/**
 * User: Nsama
 * Date: 11/4/11
 */
import edu.rit.taskers.model.Contact;
public class UpdateContactCommand {

    private Contact contact;

    public UpdateContactCommand(Contact contact){
        this.contact = contact;
    }


}

