package edu.rit.taskers.command;


import edu.rit.taskers.model.Contact;
import edu.rit.taskers.persistence.ContactDao;

public class UpdateContactCommand {

    private Contact contact;
    private ContactDao contactDao;

    public UpdateContactCommand(Contact contact, ContactDao contactDao) {
        this.contact = contact;
        this.contactDao = contactDao;
    }

    public void execute() {
        if(contact.getId() != 0) {
            contactDao.update(contact);
        } else {
            contactDao.save(contact);
        }

    }

}

